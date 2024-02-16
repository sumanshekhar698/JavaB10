package com.java.advance.multithreading;

public class PrimeMinister {//Singelton Pattern 

	private String name;
	private int age;

	private volatile static PrimeMinister pm;

	private PrimeMinister(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	static  synchronized PrimeMinister electPM(String name, int age) {//
		if (pm == null) {
			pm = new PrimeMinister(name, age);
		}

		return pm;

	}

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}
	
	

}
