package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		Integer[] a= {1,4,6,6,33};
		
		List<Integer> b=Arrays.asList(a);
		b.stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.limit(1)
		.forEach(c->System.out.println(c));
	}
}
