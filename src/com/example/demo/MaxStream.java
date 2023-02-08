package com.example.demo;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxStream {
	
	    public static void main(String[] args) {
	        
	    	Integer max = Stream.of(1, 10, 3, 4, 5, 6,8)
                    .max(Comparator.comparing(Integer::valueOf))
                    .get();
             System.out.println("The Maximum number is: " + max);

}
}
