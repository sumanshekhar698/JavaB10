package com.java.advance.io.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	transient int uan;// transient things dont take part in serialization
//	  static int id;// static things dont take part in serialization
	int id;// static things dont take part in serialization
	public static final long serialVersionUID = 2L;
	String name;
	boolean isStudent;

	public Student(int uan, int id, String name) {
		super();
		this.uan = uan;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [uan=" + uan + ", id=" + id + ", name=" + name + "]";
	}

}
