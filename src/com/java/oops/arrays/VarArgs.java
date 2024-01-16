package com.java.oops.arrays;

import java.util.Arrays;

public class VarArgs {

	public static void main(String ... suman) {
		
		System.out.println(suman.length);
		System.out.println(Arrays.toString(suman));

		test(3);
		test(4, 67, 6);

	}

	static void test(int... array) {//var args
		System.out.println(Arrays.toString(array));

	}

}
