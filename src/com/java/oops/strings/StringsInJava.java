package com.java.oops.strings;

//Immutable Strings
public class StringsInJava {

	public static void main(String[] args) {//Recursion

		print();
		char ch = 'A';// it is a primitive var
		String s1 = "Apple Brownie";// String is a Object and also a DataType
		String s2 = "Apple Brownie";// String is a Object and also a DataType
		String s3 = new String("Apple Brownie");// 9006567388
		String s4 = new String("Apple Brownie");// 9006567388

		if (s1 == s2) {// == operator compares object address
			System.out.println("Equal");// Equal
		} else {
			System.out.println("Unequal");
		}

		if (s1 == s3) {
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");// Unequal
		}

		if (s3 == s4) {
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");// Uneqal
		}

//		s3=null;
		s1 = null;
		if ((s1 != null && s2 != null)) {
			if (s1.equals(s4)) {// compare values !!! this thing is valid nly for String
				System.out.println("Equal Values");
			} else {
				System.out.println("Unequal Values");// Uneqal
			}
		}

	}

	private static void print() {
		System.out.println("print!!");
		
	}

}
