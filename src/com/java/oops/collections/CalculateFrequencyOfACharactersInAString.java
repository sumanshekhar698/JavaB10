package com.java.oops.collections;

import java.util.HashMap;

public class CalculateFrequencyOfACharactersInAString {

	public static void main(String[] args) {

		String str = "heLloWorLd";// case insensitive
		String lowerCaseStr = str.toLowerCase();

		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < lowerCaseStr.length(); i++) {

			if (hashMap.containsKey(lowerCaseStr.charAt(i))) {
				hashMap.put(lowerCaseStr.charAt(i), hashMap.get(lowerCaseStr.charAt(i)) + 1);

			} else {
				hashMap.put(lowerCaseStr.charAt(i), 1);
			}

		}

		System.out.println(hashMap);

	}

}
