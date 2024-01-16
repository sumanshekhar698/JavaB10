package com.java.oops.arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] matrix1 = { { 3, 7, 4 }, { 34, 9, -33 }, { 43, 76, 87 }

		};

		int[][] matrix2 = { { 3, 1237, 234 }, { 41, -79, 333 }, { 433, 4376, 187 }

		};
		int[][] resultMatrix=null;
		if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length)) {
			 resultMatrix = new int[matrix1.length][matrix1[0].length];
			for (int i = 0; i < resultMatrix.length; i++) {
				for (int j = 0; j < resultMatrix[i].length; j++) {
					resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
			
			

		} else {
			System.out.println("Addition impossible");
		}
		
		
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				System.out.print(resultMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
