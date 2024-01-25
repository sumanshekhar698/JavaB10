package com.java.oops.static_concept;

public class Main {

	public static void main(String[] args) {

		
		System.out.println(Student.educationBoard);
		Student.sayMyBoard();

		
		Student s1 = new Student(3, "John");
		Student s2 = new Student(7, "Jane");
		Student s3 = new Student(9, "Mary");
		
		System.out.println(s1.educationBoard);
		s1.sayMyBoard();


//
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);
//		System.out.println(Student.name);

	}

}
