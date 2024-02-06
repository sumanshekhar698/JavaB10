package com.java.oops.exception_handling;

import java.util.Scanner;


/*try catch
 * try catch catch catch
 * try catch (|)
 * try catch catch finally
 *  try catch (|) finally
 *  try finally
 * */
public class HandlingOfExceptions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("START");

		int arr[] = { 43, 5, 56, 45, 6, 99 };

		try {
			System.out.println(arr[20 / scanner.nextInt()]);
			System.out.println();
//			System.exit(77);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		}
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		} 
		catch (Exception e) {// DEB Dafault Excetion catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finally called");
			scanner.close();
		}
		
		

//		System.out.println("END");
	}

}
