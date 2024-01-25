package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		ShapeArea shapeArea = new ShapeArea();
		long areaOfARectangle = shapeArea.areaOfARectangle(10, 5);
		System.out.println(areaOfARectangle);
		
		ShapeAreaPolymorphic shapeAreaPolymorphic = new ShapeAreaPolymorphic();
		System.out.println(shapeAreaPolymorphic.area(7.8f));
		System.out.println(shapeAreaPolymorphic.area(10, 20));
		
		


	}

}
