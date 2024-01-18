package com.java.oops.intro;

public class WrapperClasses {

	public static void main(String[] args) {
		int a = 9;
//		Integer x = new Integer(9);

		Integer x = a;
		x++;
		x *= 8;
		System.out.println(x);
		System.out.println(x.MIN_VALUE);

		int x_ = x;// Auto Unboxing
		int y_ = 99;
		Integer y = y_;// Auto Boxing

		// boolean long
		char m = 'A';
		Character n = m;

		String numStr = "78";
		int convertedNum = Integer.valueOf(numStr);
		System.out.println(++convertedNum);

		int num2 = 999;
		String num2Str = "" + num2;

	}

}
