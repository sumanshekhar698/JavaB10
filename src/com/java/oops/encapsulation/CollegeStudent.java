package com.java.oops.encapsulation;

public class CollegeStudent {

	final private int id;
	public String name;// default

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public CollegeStudent(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
//		sayMyName();
	}

//	@Override
	public String toString() {

		return "Student [id=" + id + ", name=" + name + "]";
	}

	private void sayMyName() {
		System.out.println(this.name);
	}

}
