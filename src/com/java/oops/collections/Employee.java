package com.java.oops.collections;

public class Employee {

	int empID;
	String name;
	int age;

	public Employee(int empID, String name, int age) {
		super();
		this.empID = empID;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", age=" + age + "]";
	}

}