package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementCount {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> map=names.stream()
				//checking if frequency greater than 1
				.filter(x -> Collections.frequency(names, x)>1)
				//collecting the count 
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

	}

}
