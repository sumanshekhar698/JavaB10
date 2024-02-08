package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {

	public static void main(String[] args) {
		int[] arr = { 43, 456, 76, 6, 687, 68, 6, 88 };
//		PROS : Accesing using index is very fast
//		CONS : Homogenous, Fixed length

		ArrayList list = new ArrayList();
		list.add("Soumya");
		list.add(1);
		list.add(1.88);
		list.add(true);
		list.add(new ArrayListExample());
		list.add("Soumya");

		System.out.println(list);
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(55);
		numList.add(5);
		numList.add(32);
		numList.add(23);
		numList.add(-4);
		numList.add(32);

		numList.add(4);
		numList.add(104);

//		for (int i = 0; i < numList.size(); i++) {// HORRIBLE WAY
//			numList.add(7);
//			System.out.println(numList.get(i));
//		}

		for (Integer num : numList) {
//			numList.add(7);
			System.out.print(num + " ");
		}
		System.out.println();
//		55 5 32 23 -4
		Iterator<Integer> itr = numList.iterator();
		while (itr.hasNext()) {
			Integer num = (Integer) itr.next();
			System.out.print(num + " ");
		}
		System.out.println();

		long count = numList.stream().filter(num -> (num % 2 == 0) & (num >= 0)).count();
		System.out.println("COUNT :: " + count);
		numList.stream().filter(num -> (num % 2 == 0) & (num >= 0)).forEach(System.out::println);// Streaming
		List<Integer> collect = numList.stream().filter(num -> (num % 2 == 0) & (num >= 0))
				.collect(Collectors.toList()); // Streaming
		System.out.println(collect);

		System.out.println(numList.size());
		System.out.println(numList.contains(-4));
		System.out.println(numList.isEmpty());

		System.out.println(numList);
		System.out.println(numList.indexOf(32));// First Index
		System.out.println(numList.lastIndexOf(32));// First Index

		numList.remove(2);
		System.out.println(numList);
		// Utility Classes
		Collections.sort(numList, Collections.reverseOrder());//Make sure this is a sortable collection
		System.out.println(numList);

		
		// Utility Classes
		Collections.shuffle(numList);//Make sure this is a sortable collection
		System.out.println(numList);
		
		numList.clear();
		System.out.println(numList);

	}

}
