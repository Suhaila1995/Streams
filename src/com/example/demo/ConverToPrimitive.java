package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverToPrimitive {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		 Arrays.stream(nums).boxed().collect(Collectors.toList())
				.forEach(System.out::println);
		

	}

}
