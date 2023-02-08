package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class StringLengthFilter {

	public static void main(String[] args) {
		 List<String> stringList = Arrays.asList("Hello","Hi","How","Are","You");
		 
		long count=stringList. stream().filter(str -> str.length()==3).count();
        System.out.println(count);
	}

}
