package com.java.oops.arrays;

import java.util.Arrays;

public class PassByValueVsPassByRef {

	public static void main(String[] args) {
		int[] arr = { 2, 43, 453, 22, 34, 332, 3, 9 };//arrays are object
		int x = 99;

		change(x);//pass by value
		System.out.println(x);//

		changeArray(arr);//pass by ref
		System.out.println(Arrays.toString(arr));//

	}

	private static void changeArray(int[] array) {
		array[0] = -9999;

	}

	private static void change(int x) {
		x = 0;

	}

}
