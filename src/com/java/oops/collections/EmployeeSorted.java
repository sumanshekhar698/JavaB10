package com.java.oops.collections;

public class EmployeeSorted implements Comparable<EmployeeSorted> {

	int empID;
	String name;
	int age;

	public EmployeeSorted(int empID, String name, int age) {
		super();
		this.empID = empID;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(EmployeeSorted emp) {
		if (emp.empID == this.empID)
			return 0;
		else if (emp.empID > this.empID)
			return 7;
		else
			return -67;
	}

}