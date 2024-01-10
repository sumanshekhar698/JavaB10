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

		b = -128;// Rotate
		b -= 500;
		System.out.println(b);

//		Shorthand Operators
		int dozen = 0;
//		dozen = dozen + 12;
		dozen += 12;
		dozen %= 3;

//		Comparison Operators  >  <   == != >= <= !
		if (dozen % 2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");

//		BitWise Operator
		System.out.println(8 & 12);// BIT WISE AND OPERATOR
		System.out.println(8 | 12);// BIT WISE OR OPERATOR
		System.out.println(8 ^ 12);// BIT WISE XOR OPERATOR
		System.out.println(~8);// BIT WISE NOT OPERATOR

		System.out.println(8999 ^ 8999);// BIT WISE XOR OPERATOR 0

	}

}
