package com.java.basics;

public class LoopsInJava {

	public static void main(String[] args) {

		// 1 to 100

		// for loop
		int i = 1;
		for (; i <= 100; i++) {// initialisation; condoition ;updation
			if (i % 2 == 0)
				System.out.print(i + " ");
		}

		System.out.println(i);

		System.out.println();
		for (int j = 1; j <= 100; j++) {// initialisation; condoition ;updation
			if (j % 2 == 0)
				continue;// skip[ the current iteration
			System.out.print(j + " ");
		}

		System.out.println();
		for (int j = 1; j <= 100; j++) {// initialisation; condoition ;updation
			if (j == 55)
				break;// break the loop
			System.out.print(j + " ");
		}

		System.out.println();

		i = 10;
		int sum = 0;// 0 -10
		while (i >= 0) {
			sum += i;
			i--;
		}

		System.out.println(sum);

//		do while
		int f = -1;

		do {
			System.out.println("HEY!");///do while runs for atleast 1 time
		} while (f > 0);
		
		
		
		

	}

}
