package com.java.oops.strings;

public class MutableStrings {

	public static void main(String[] args) {


		//StringBuffer StringBuilder
		
		StringBuffer sb1 = new StringBuffer("tom is ");//same object will be changed MUTABLE --> preferred in MultiThread environment

		StringBuilder sb = new StringBuilder("tom is ");//same object will be changed MUTABLE
		sb.append("a cat");
		System.out.println(sb);

	}

}
