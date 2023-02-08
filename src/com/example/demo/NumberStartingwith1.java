//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingwith1 {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		 myList.stream().map(s -> s.toString()).filter(s -> s.startsWith("1")).collect(Collectors.toList())
		 .forEach(System.out::println);

	}

}
