package com.java.eight;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample {
	
	public static void main(String args[]) {
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(25);
		l.add(76);
		l.add(2);
		l.add(34);
		l.add(33);
		
		l.stream().forEach(x -> System.out.println(x));
		
		System.out.println("------------------");
		
		l.stream().filter(x -> (x%2 == 0)).forEach(x -> System.out.println(x));
		
		System.out.println("------------------");
		
		l.stream().map(x -> (x*2)).forEach(x -> System.out.println(x));
	}

}
