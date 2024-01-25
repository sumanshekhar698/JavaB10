package com.java.oops.static_concept;

public class Student {

	int id;
	static String educationBoard;//2 intance/ object level vriables
	String name;// class level variables SHARED  1
	
	{
		
		System.out.println("Non Static block executed 1");

	}
	static {
		System.out.println("Static block executed 1");
		educationBoard = "CBSE";
		
	}
	
	static {
		System.out.println("Static block executed 2");
		
	}
	
	public Student(int id, String name) {// parameterized constructor
		System.out.println("Constructor executed");

		this.id = id;
		this.name = name;
//		System.out.println(educationBoard);
		

	}
	
	static void sayMyBoard() {//static methods and blocks can oly access static ythings DIRCETLY
		System.out.println(educationBoard);
//		System.out.println(name);

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", educationBoard=" + educationBoard + "]";
	}


}
