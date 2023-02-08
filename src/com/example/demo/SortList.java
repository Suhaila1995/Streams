package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		//List<String> str = Arrays.asList("Hi","Iam","Fathimath","Suhaila");
		List<Integer> str = Arrays.asList(4,5,6,7,2,1,3);
	    str.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

	}

}
