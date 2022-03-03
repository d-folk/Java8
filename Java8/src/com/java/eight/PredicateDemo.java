package com.java.eight;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PredicateDemo demo = new PredicateDemo();
		
		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println("Length of string is greater than 5: "+checkLength.test("Deep"));
		
		Predicate<String> ref = demo :: testing;
		System.out.println("Length of Golani is greater than 5: "+ref.test("Golani"));
		
		//System.out.println("Trying funtional programming way: "+Predicate<String> :: chec);
		
		Function<Integer, Integer> square = i -> i*i;
		System.out.println("Suare of provided input - "+square.apply(3));
	}
	
	public boolean testing(String s) {
		int i = s.length();
		boolean f = i >= 5;
		System.out.println("Length of string is greater than 5 in testing method: " + f);
		return f;
	}

}
