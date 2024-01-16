package com.java.oops.arrays;

public class OneDArray {

	public static void main(String[] args) {

		String[] namesOfSubjects = { "Maths", "English", "Science", "hindi" };
		int[] arr = new int[5];
		print1DArray(namesOfSubjects);
//		System.out.println(arr);
//		System.out.println(arr.hashCode());
		print1DArray(arr);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * i;
		}

		print1DArray(arr);

	}

	static void print1DArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
	
	static void print1DArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}
