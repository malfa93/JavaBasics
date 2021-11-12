package com.syntax.class15;

public class Dog {

	String name;  // Instance Variable
	String color; // Instance Variable
	
	static int noOfLegs=4; // Static variables
	
	void sleep() {
		
		int time= 3; // Local Variable, this is only accessible inside this void method
		
		System.out.println(name+" is sleeping");
	}
	
	void eat() {
		
		//System.out.println(time); This wont be accesseable because time is a local variable to another void method (sleep method)
		System.out.println(name+" can eat");
		
		
	}
}
