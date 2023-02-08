package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStream {

	public static void main(String[] args) {
		List<String> str1 = Arrays.asList("Hi","Iam","Fathimath","Suhaila");
		List<String> str2 = Arrays.asList("Whats","Your","Name");
		Stream.concat(str1.stream(), str2.stream()).forEach(System.out::println);

	}

}
