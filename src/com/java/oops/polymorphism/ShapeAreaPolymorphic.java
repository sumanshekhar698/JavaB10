package com.java.oops.polymorphism;

public class ShapeAreaPolymorphic {

	// Rule of Polymorphism
//	name should be same
//	parameter number should be unique
//	parameter type should be unique
//	Position of parameter

	
//	Ehiel compilation java will know which method to call :: Method Overloading  is also called compile time polymorphism
	int area(int side) {//Method Overloading :: area method/fn is overloaded
		return side * side;
	}

	long area(int length, int breadth) {
		return length * breadth;
	}

	double area(float radius) {
		return Math.PI * radius * radius;
	}

	float area(int base, float height) {
		return 0.5f * base * height;
	}

	float area(float height, int base) {
		return base * height;
	}

}
