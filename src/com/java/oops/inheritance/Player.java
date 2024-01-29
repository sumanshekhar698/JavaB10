package com.java.oops.inheritance;

public class Player {// a class can have only one direct parent, By default object is the parent of
						// every class
// A class can have grand parents
	String name;
	int age;
	int playingYears;
	Gender gender;
	int x = 100;
	private int secretNo = 989;// private things cannot be inherited

	public Player(String name, int age, int playingYears, Gender gender) {
//		super();

		System.out.println("Parent Constructor");
		this.name = name;
		this.age = age;
		this.playingYears = playingYears;
		this.gender = gender;
	}

	final void sayMyName() {
		System.out.println(this.name);
	}

	void printX() {
		System.out.println("Parent print x");
		System.out.println(x);// 99
//		System.out.println(super.x);//supr means immediate parent
	}
	
	

}
