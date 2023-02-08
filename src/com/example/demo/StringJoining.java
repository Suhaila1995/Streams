package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Hello", "HI", "There");

		String jonStr = str.stream()
		                .map(String::valueOf)
		                .collect(Collectors.joining(" - "));
		//output
		System.out.println(jonStr);

	}

}
