package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(integerList.stream().map(i -> i*3).collect(Collectors.toList()));

	}

}
