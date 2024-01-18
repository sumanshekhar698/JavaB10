package com.java.oops.constructors;

public class Student {

	int id;
	String name;

//	Student()

	// a constructor will not have a return type
	Student() {// Consturctor | not parameterized constructor
		System.out.println("Student() called");
	}

	
	//Constructor Chaining
	public Student(int id, String name) {// parameterized constructor

		this();
		System.out.println("Student(int id, String name) called");

		this.id = id;// Shadow issue
		this.name = name;

	}
	



	public String getDetails() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
