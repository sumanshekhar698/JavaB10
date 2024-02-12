package com.java.oops.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

//		K:V rollNo:Name
		HashMap<Integer, String> map = new HashMap<>();// K:V rollNo : Name [
//		You cannot have duplicate Keys in map | keys are hashed and stored | map are unordered
		map.put(2, "John");// {1=Jill} Entry K:V
		map.put(4, "Jay");
		map.put(8, "Jacob");
		map.put(2, "Johnny");
		map.put(16, "Jill");
//		map.put(-1, "Jill");
//		map.put(100, "Jill");
//		map.put(9, "Jill");
		System.out.println(map);

		
		System.out.println("___________________________________________________________________");
		HashMap<Integer, String> map2 = new LinkedHashMap<>();// TreeMap to store the K:V in a sorted way
		map2.put(2, "John");
		map2.put(4, "Jay");
		map2.put(8, "Jacob");
		map2.put(2, "Johnny");
		map2.put(16, "Jill");
//		map.put(-1, "Jill");
		System.out.println(map2);

		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("Key : " + entry.getKey() + " | Value: " + entry.getValue());
		}
		
		map.entrySet().stream().forEach(System.out::println);
		System.out.println(map);
		

	}

}
