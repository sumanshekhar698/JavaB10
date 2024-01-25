package com.java.oops.polymorphism;

public class ShapeArea {

	int areaOfASquare(int side) {
		return side * side;
	}

	double areaOfACicle(float radius) {
		return Math.PI * radius * radius;
	}

	long areaOfARectangle(int length, int breadth) {
		return length * breadth;
	}

	float areaOfTriangle(int base, float height) {
		return 0.5f * base * height;
	}

	float areaOfParallelogram(int base, float height) {
		return base * height;
	}

}
