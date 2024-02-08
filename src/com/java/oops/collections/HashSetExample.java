package com.java.oops.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(55);
		numList.add(5);
		numList.add(5);
		numList.add(4);
		numList.add(104);
		numList.add(4);
		numList.add(4);

		Set<Integer> collect = numList.stream().collect(Collectors.toSet());
		
		//HashSet doesnot contains duplicate values
		HashSet<Integer> set = new HashSet<>();// hashing  
		
		for (Integer num : numList) {
			set.add(num);
		}
		System.out.println(set);
		System.out.println(set.contains(5));//Very Very fast
//		System.out.println(set.get(0)//there is not index acces);
		
		

	}

}
