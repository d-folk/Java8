package com.java.eight;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		J obj = str -> System.out.println("J in Lamda"+str);
		
		obj.printMe("Deepak");
		
//		Predicate<String> p = str -> str.length() >= 5;
//		
//		
//		
//		System.out.println(p.test("Deepak"));
		
		Consumer<String> con = str -> str.length(); 
		
		con.accept("Yukti");
		
		/*
		 * Function<String, Integer> func = (str) -> str.length();
		 * System.out.println("Printinh "+func.apply("Yuvan"));
		 */
		
		Supplier<Integer> supp = () -> 2*8*4;
		System.out.println(supp.get());
		
	}

}
