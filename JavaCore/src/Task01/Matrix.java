package Task01;

import java.util.Arrays;

public class Matrix {
	
	public static void main(String[] args) {
		
		int m = 6;
		int n = 6;
		int[][] matrix = new int[m][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i == j){
					matrix[i][j] = 1;
					matrix[i][matrix[i].length - j - 1] = 1;
				}
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
