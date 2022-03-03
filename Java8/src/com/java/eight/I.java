package com.java.eight;

public interface I{
	default public void printMe() {
		System.out.println("I");
	}
	
	static void holla() {
		System.out.println("Holla..");
	}
}

