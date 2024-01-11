package com.java.oops.intro;

public class Main {

	public static void main(String[] args) {

		int x, y = 9;// declaration
		x = 0;// intialisation
//		System.out.println(x);

		Car c1 = new Car();
		c1.color = "RED";
		c1.maxSpeed = 110;
		c1.mielage = 15.7f;
		
		System.out.println(c1);
//		System.out.println(c1.hashCode());
//		System.out.println(c1.color);// null
//		System.out.println(c1.mielage);// 0.0
		
		c1.sayMyCarSpecs();

	}

}
