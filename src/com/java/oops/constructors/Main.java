package com.java.oops.constructors;

import com.java.oops.encapsulation.CollegeStudent;

public class Main {

	public static void main(String[] args) {

//		Student s1 = new Student();
//		System.out.println(s1.getDetails());

		Student s2 = new Student(3, "John");
		System.out.println(s2.getDetails());

		CollegeStudent cs1 = new CollegeStudent(0, "Tom");
		cs1.name = "Tommy";
	}

}
