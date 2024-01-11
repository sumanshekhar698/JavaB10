package com.java.oops.intro;

public class Car {
	// has properties --> instance/object variables
	float maxSpeed;//0.0
	float mielage;//0.0
	String color;//null

	// does --> function = method
	void drive() {
		System.out.println("DRIVING ...");

	}

	void sayMyCarSpecs() {
		System.out.println("maxSpeed :: " + maxSpeed);
		System.out.println("mielage :: " + mielage);
		System.out.println("color :: " + color);
	

	}

}
