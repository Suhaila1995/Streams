package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOfList {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		integerList.stream().map(i -> i*i).filter(i-> i<45).collect(Collectors.toList()).
		forEach(System.out::println);

	}

}
