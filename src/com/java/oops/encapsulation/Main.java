package com.java.oops.encapsulation;

public class Main {

	public static void main(String[] args) {
		CollegeStudent s1 = new CollegeStudent(1, "John");
		System.out.println(s1);

		CollegeStudent s2 = new CollegeStudent(2, "Jane");
		System.out.println(s2);
//		s2.id = -4444;
//		s2.setId(88);;
		System.out.println(s2.getId());
//		System.out.println(s2.i);
		s2.name = "Mr Bean";
		System.out.println(s2);


	}

}
