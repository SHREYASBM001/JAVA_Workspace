package com.stringconcepts;

public class Arewrite {

    public static void main(String[] args) {

        String s = "hello";
        /*
         * "hello" is a String literal.
         * String literals are stored in the String Constant Pool (SCP).
         *
         * When Java sees a String literal, it first checks whether an object with
         * the same content is already present in the SCP.
         *
         * If it is already present, Java does not create a new String object again.
         * Instead, it reuses the already existing pooled String object, and the
         * reference of that pooled object is assigned to the variable.
         *
         * So here, s refers to the pooled String object "hello".
         */

        String s1 = "hello";
        /*
         * Again, "hello" is a String literal.
         * Java checks the SCP and finds that "hello" is already present there because
         * it was already created when s was assigned.
         *
         * So Java reuses the same pooled String object instead of creating a new one.
         * That means s and s1 both point to the same object in the SCP.
         *
         * This pooling mechanism is used to save memory and avoid creating duplicate
         * String literal objects unnecessarily.
         */

        System.out.println(s == s1); // true
        /*
         * == checks whether both reference variables point to the exact same object.
         *
         * Since both s and s1 point to the same pooled "hello" object,
         * the result is true.
         */

        String s2 = new String("hello");
        /*
         * This line behaves differently from a plain literal assignment.
         *
         * First, Java checks the SCP for the literal "hello".
         * If "hello" is not present in the SCP, it creates it there.
         * If it is already present, it simply reuses the pooled object.
         *
         * Then, because of the keyword 'new', Java creates one more completely new
         * String object in heap memory, separate from the pooled object.
         *
         * So:
         * - the pooled "hello" may exist in SCP
         * - a new heap object containing "hello" is created
         * - s2 points to the heap object, not to the pooled object
         *
         * Therefore, s and s2 do not point to the same object.
         */

        System.out.println(s == s2); // false
        /*
         * s points to the pooled "hello" object.
         * s2 points to a different heap object created by new String("hello").
         *
         * Since they are different objects, == returns false.
         *
         * Note:
         * If we used s.equals(s2), then the result would be true,
         * because both contain the same text "hello".
         * == checks reference equality, whereas equals() checks content equality.
         */

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String s3 = "abcd";
        /*
         * "abcd" is a String literal, so Java stores or reuses it from the SCP.
         * Therefore, s3 points to the pooled String object "abcd".
         */

        String s4 = "ab";
        /*
         * "ab" is also a String literal,checks if the "ab" is already present in SCP,else creates a new String object.
         * since "ab" is not present,a new String object is created for "ab"
         * and that object reference is stored in s4.
         */

        String s6 = s4 + "cd";
        /*
         * Here, s4 is a normal reference variable.
         * Even though s4 currently points to the pooled literal "ab",
         * the expression s4 + "cd" is treated as runtime concatenation, because s4 is
         * a variable and not a compile-time constant in this case.
         *
         * That means Java does not simply combine the literals at compile time and look
         * directly in the SCP for "abcd".
         *
         * Instead, the concatenation happens during runtime, and the result is a new
         * String object.
         *
         * So even though the content of s6 becomes "abcd", its reference is different
         * from the pooled object referred to by s3.
         */

        System.out.println(s3 == s6); // false
        /*
         * s3 points to the pooled "abcd" object.
         * s6 points to a new String object created during runtime concatenation.
         *
         * The contents are the same, but the objects are different.
         * Therefore == returns false.
         */

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String s7 = "abcd";
        /*
         * Again, "abcd" is a String literal.
         * Java checks the SCP and finds that "abcd" is already present there because
         * of s3.
         *
         * Therefore, Java reuses the same pooled object.
         * So s7 and s3 both point to the same pooled String object "abcd".
         */

        System.out.println(s3 == s7); // true
        /*
         * Both s3 and s7 point to the same pooled object "abcd",
         * so == returns true.
         */

        final String s8 = "ab";
        /*
         * s8 points to the pooled literal "ab", just like s4.
         *
         * The important thing here is not merely that s8 points to "ab",
         * but that s8 is declared final and initialized with a constant expression.
         *
         * Because of that, Java can treat s8 as a compile-time constant.
         *
         * Note:
         * The reason s8 == s4 is true is simply because both refer to the same pooled
         * literal "ab". The 'final' keyword is not the reason for this comparison
         * becoming true.
         *
         * The real importance of final will be seen in the next concatenation.
         */

        System.out.println(s8 == s4); // true
        /*
         * Both s8 and s4 refer to the same pooled literal "ab",
         * so == returns true.
         */

        String s9 = s8 + "cd";
        /*
         * Here is the important special case.
         *
         * Since s8 is final and initialized with a String literal, Java treats s8 as
         * a compile-time constant.
         *
         * Therefore, s8 + "cd" is treated by the compiler as if we had written:
         *
         *     "ab" + "cd"
         *
         * and that becomes:
         *
         *     "abcd"
         *
         * during compilation itself.
         *
         * Since "abcd" is already present in the String Constant Pool (because of s3),
         * Java reuses the same pooled object instead of creating a new runtime String.
         *
         * Therefore, s9 points to the same pooled "abcd" object as s3 and s7.
         */

        System.out.println(s3 == s9); // true
        /*
         * s3 points to pooled "abcd".
         * s9 also points to pooled "abcd" because the concatenation was resolved at
         * compile time.
         *
         * Therefore == returns true.
         */

        System.out.println(s7 == s9); // true
        /*
         * s7 also points to the same pooled "abcd" object.
         * Therefore s7 == s9 is also true.
         */
    }
}