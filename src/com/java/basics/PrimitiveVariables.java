package com.java.basics;

public class PrimitiveVariables {

	public static void main(String[] args) {

//		R4: Keywords cannot be used as ANY name
//		Integer
		byte a = 4;// 1 byte = 8 bits
		short b = 5;// 2 bytes
		int c = 888;// 4 bytes
		long d = 997907;// 8 bytes

		long phoneNumber = 9006567388L;//2 s complement

		c = b;
//		b = c;
//		System.out.println(b);

//		Boolean
		boolean isJavEasy = false;// 1 bit
		isJavEasy = true;

		// floating point DECIMALS
		float valueOfAPie = 3.14159265359f;//4 bytes
		double valueOfAPieHigh = 3.14159265359;//8 bytes
		System.out.println(valueOfAPie);
		System.out.println(valueOfAPieHigh);
		
		float num = phoneNumber;//EXCEPTION CASE IEEE Algo
		System.out.println(num);//9.0065674E9 = 90065674
		
//		character
		char ch = 'Z';
		int chINT = ch;
		System.out.println(chINT);
		
		char rupee = '₹';
		System.out.println(rupee);
		System.out.println((int)rupee);//8377
		
//		Number System
		
//		Binary [2] 0 and 1
//		Octal [8] 0-7
//		Decimal [10]   0-9
//		Hexadecimal [16] 0-9 U A - F
		
		int x = 0b101010101;//0b Binary
		System.out.println(x);//341 Printing always in Dcimal
		
		int y = 06755;//0 OCTAL
		System.out.println(y);//3565
		
		int z = 0x6755AF8;//0 OCTAL
		System.out.println(z);//3565

		
		
	}

}
