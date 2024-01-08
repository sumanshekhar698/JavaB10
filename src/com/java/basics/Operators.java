package com.java.basics;

public class Operators {

	public static void main(String[] args) {

		int x = 7;// Assingment Operator

//		MathematicalOperators  +-*/ %
		System.out.println(10 % 3);

//		Unary Operators
		x++;
		System.out.println(x);// 8
		++x;
		System.out.println(x);// 9
		System.out.println(x++);// 9
		System.out.println(x);// 10

		x = 100;
		System.out.println(x++);

		x = 50;
		System.out.println(++x);// 51
		System.out.println(x);// 51

		int y = 90;
		System.out.println(y--);// 90
		System.out.println(--y);// 88

		int m = 1000, n = 600;
		m = ++m - n-- - --m + ++n - ++m + n-- - n--;
		System.out.println(m);

		byte b = 127;// -128 to 127
		b = (byte) (b + 5);
		System.out.println(b);// -128

//		System.out.println(Short.MAX_VALUE);
		short s = 32765;
		s = (short) (s + 6);
		System.out.println(s);

		b = -128;//Rotate
		b -= 500;
		System.out.println(b);
	}

}
