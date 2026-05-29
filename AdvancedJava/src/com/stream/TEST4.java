package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TEST4 {
	public static void main(String[] args) {
		List<List<String>> l=Arrays.asList(Arrays.asList("",""),Arrays.asList("shreyas","bm"),Arrays.asList("Hello","World"));
		List<String> names=Arrays.asList("Jimmy","Dog");
		
		l.stream()
		 .flatMap(x->x.stream())
		 .filter(a->a.length()!=0)
		 .forEach(a->System.out.println(a));
		
	}
}
