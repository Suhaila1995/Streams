package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,2,3);
		integerList.stream().collect(Collectors.toSet()).forEach(System.out::println);

	}

}
