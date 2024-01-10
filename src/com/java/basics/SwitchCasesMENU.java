package com.java.basics;

import java.util.Scanner;

public class SwitchCasesMENU {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		loop1: while (flag) {
			System.out.println("\nEnter a number \n 1: Coke \n 2: Mirinda \n 3 : Milk \n 4: Water \n 0:STOP");

			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("Enjoy Coke");
				break;
			case 2:
				System.out.println("Enjoy Mirinda");
				break;
			case 3:
				System.out.println("Enjoy Milk");
				break;
			case 4:
				System.out.println("Enjoy Water");
				break;
			case 0:
				System.out.println("Bye Bye!");
				break loop1;
//				System.exit(8);
//				flag = false;
//				break;
			default:
				System.out.println("INVALID INPUT");
				break;
			}
		}

//		if(input == 1) {
//			System.out.println("Enjoy Coke");
//		} else if (input == 2) {
//			System.out.println("Enjoy Mirinda");
//		}else if (input == 3) {
//			System.out.println("Enjoy Milk");
//		}else if (input == 4) {
//			System.out.println("Enjoy Water");
//		} else {
//			System.out.println("INVALID INPUT");
//		}

	}

}
