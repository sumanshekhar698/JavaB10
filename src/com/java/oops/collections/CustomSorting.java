package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting {

	public static void main(String[] args) {
		ArrayList<EmployeeSorted> arrayList = new ArrayList<>();
		arrayList.add(new EmployeeSorted(66, "Jacob", 30));
		arrayList.add(new EmployeeSorted(23, "Jill", 23));
		arrayList.add(new EmployeeSorted(12, "Jane", 24));
		arrayList.add(new EmployeeSorted(45, "John", 60));
		arrayList.add(new EmployeeSorted(13, "Jhonny", 30));
		arrayList.add(new EmployeeSorted(21, "Jay", 31));

		Collections.sort(arrayList);
		arrayList.stream().forEach(System.out::println);

		System.out.println("__________________________________________________________________");
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(66, "Barny", 30));
		empList.add(new Employee(23, "Toddy", 23));
		empList.add(new Employee(12, "Jane", 24));
		empList.add(new Employee(45, "John", 60));
		empList.add(new Employee(13, "Aby", 30));
		empList.add(new Employee(21, "Jay", 30));

//		Collections.sort(empList, new AgeComparator());
		Collections.sort(empList, new NameComparator());

		empList.stream().forEach(System.out::println);

	}

}

class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.age == emp2.age)
			return 0;
		else if (emp1.age > emp2.age)
			return 1;
		else
			return -1;
	}

}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.name.compareTo(emp2.name);// sort is dictionary order
	}

}
