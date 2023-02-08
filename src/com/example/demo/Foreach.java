package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static  void main(String[] args) {
		
		        List<String> str = Arrays.asList("Hi","Iam","Fathimath","Suhaila");
		        str.stream().forEach(System.out::println);
		    }
		
	}


