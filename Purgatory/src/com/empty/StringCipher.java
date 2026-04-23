//package com.empty;
//
//public class StringCipher {
//
//	    
//	    /**
//	     * Encodes a string by shifting each character by a specified amount
//	     * @param text The text to encode
//	     * @param shift The number of positions to shift (can be negative for decoding)
//	     * @return The encoded string
//	     */
//	    public static String encode(String text, int shift) {
//	        StringBuilder result = new StringBuilder();
//	        
//	        for (char c : text.toCharArray()) {
//	            if (c >= 'a' && c <= 'z') {
//	                // Shift lowercase letters with wrap-around
//	                result.append((char) ((c - 'a' + shift) % 26 + 'a'));
//	            } 
//	            else if (c >= 'A' && c <= 'Z') {
//	                // Shift uppercase letters with wrap-around
//	                result.append((char) ((c - 'A' + shift) % 26 + 'A'));
//	            } 
//	            else if (c >= '0' && c <= '9') {
//	                // Shift digits with wrap-around
//	                result.append((char) ((c - '0' + shift) % 10 + '0'));
//	            } 
//	            else {
//	                // Keep special characters unchanged
//	                result.append(c);
//	            }
//	        }
//	        
//	        return result.toString();
//	    }
//	    
//	    /**
//	     * Decodes a string (opposite of encode)
//	     * @param text The text to decode
//	     * @param shift The shift amount used during encoding
//	     * @return The decoded string
//	     */
//	    public static String decode(String text, int shift) {
//	        return encode(text, -shift);  // Negative shift reverses the encoding
//	    }
//	    
//	    // Main method with examples
//	    public static void main(String[] args) {
//	        String original = "xyz 123!";
//	        int shiftAmount = 3;
//	        
//	        String encoded = encode(original, shiftAmount);
//	        String decoded = decode(encoded, shiftAmount);
//	        
//	        System.out.println("Original:  " + original);
//	        System.out.println("Encoded:   " + encoded);
//	        System.out.println("Decoded:   " + decoded);
//	        
////	        // More examples
////	        System.out.println("\n--- Shift by 3 ---");
////	        System.out.println("Original:  abc xyz ABC XYZ 789");
////	        System.out.println("Encoded:   " + encode("abc xyz ABC XYZ 789", 3));
////	        
////	        // Wrap-around example (z + 2 = b)
////	        System.out.println("\n--- Wrap-around Example ---");
////	        System.out.println("Original:  xyz");
////	        System.out.println("Encoded:   " + encode("xyz", 2));
//	    }
//	
//}
