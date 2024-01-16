package com.java.oops.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtilityClasses {

	public static void main(String[] args) {
		int[] arr = { 4234, 243, 242, 42, 4, 4, 423, 243 };
		// Bubble Sort, Merge Sort, Selction Sort, Insertion Sort
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, -1);
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 0, 3, 9);
		System.out.println(Arrays.toString(arr));
//		Arrays.
		
//		Cloning
		int[] arr2 = { 4234, 243, 242, 42, 4, 4, 423, 243 };
		int[] arr4 = arr2.clone();//Only applicable for 1D arrays
		int arr3 [] = arr2;//pass by ref
		Arrays.fill(arr3, 100);
		System.out.println(Arrays.toString(arr2));
		
		//create a NEW array of size arr3.length and then copy manually
		
		System.out.println(Arrays.toString(arr4));



	}

}
