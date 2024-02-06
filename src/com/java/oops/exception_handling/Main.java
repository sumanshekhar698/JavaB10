package com.java.oops.exception_handling;

public class Main {

	static int count =0; 
	public static void main(String[] args) {
//	call();
		System.out.println("START");
		
		try {
			System.out.println(8/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");

	}
	
	static void call(){
		++count;
		System.out.println(count);
		call();
	}

}


/*
 * Object 
 * Throwable 
 * Exception | Error
 */