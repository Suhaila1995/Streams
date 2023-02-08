package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		System.out.println(integerList.stream().mapToInt(Integer::valueOf).sum());
		
	}

}
