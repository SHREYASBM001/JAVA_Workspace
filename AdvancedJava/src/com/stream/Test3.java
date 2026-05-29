package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
	public static void main(String[] args) {
		Integer [] a= {3,1,3,4,1,4};
		
		List<Integer> b=Arrays.asList(a)
							  .stream()
							  .distinct()
							  .collect(Collectors.toList());
		System.out.println(b);
		b.stream()
		 .forEach(c->System.out.println(c));
	}
}
