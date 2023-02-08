package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class UniqueElement {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,98,10,25,98,98,25,15);
		myList.stream().distinct().forEach(System.out::println);

	}

}
