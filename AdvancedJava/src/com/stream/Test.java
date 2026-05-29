package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
//		List<Integer> l=Arrays.asList(1,3,4,5,2);
		List<String> names=Arrays.asList("rHREYAS","Raveesh","Girish");
		
		List<String> res=names.stream()
		.map(a-> a.toLowerCase())
		.filter(a-> a.startsWith("r"))
		.collect(Collectors.toList());
		
		System.out.println(res);
	}
}
