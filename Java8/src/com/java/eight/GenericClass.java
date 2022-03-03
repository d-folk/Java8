package com.java.eight;

import java.util.Arrays;
import java.util.List;

public class GenericClass<R, V> {

	private R r;
	private V v;
	
	public GenericClass(R r, V e){
		this.r = r;
		this.v = e;
	}
	
	public R getObjectR() {
		return r;
	}
	
	public V getObjectV() {
		return v;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String, Integer> obj = new GenericClass<String, Integer>("Deepak", 18);
		System.out.println("Geeting string: "+obj.getObjectR() + " Role No: "+obj.getObjectV());
		
		I i = new I() {};
		
		System.out.println("Printing Again: ");
		
		//Interface Default method call
		i.printMe();
		
		//Interface Static method call
		I.holla();
		
		System.out.println("*******************************");
		
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		for(int j : values) {
			System.out.println(j);
		}
		
		System.out.println("*******************************");
		
		values.forEach(k -> System.out.println(k));
		
		System.out.println("Alternate Numbers*******************************");
		
		values.stream().filter(k -> (k%2 == 0)).forEach(k -> System.out.println(k));
			
	}
}


