package com.java.oops.arrays;

public class Jagged2DArray {

	public static void main(String[] args) {

		int[][] array2D = { 
				{ 23, 4, 4, 4, 5 }, 
				{ 4, 45, 2 }, 
				{ 423, 554, 3434, 34, 43, 4, 4, } };
		
		int[][] array3 = new int[4][];
		array3[0] = new int[7];
		array3[1] = new int[2];
		array3[2] = new int[9];
		array3[3] = new int[1];
		
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();

		}
	}

}
