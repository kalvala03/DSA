package com.Array2D;
import java.util.Arrays;

//https://leetcode.com/problems/set-matrix-zeroes
public class SetMatrixZereos {
	// Bruteforce --> Tc: O(m*n*(m+n)) , Sc: O(1)
	static void method(int[][] ar) {
	    for (int row = 0; row < ar.length; row++) {
	        for (int col = 0; col < ar[row].length; col++) {
	            if (ar[row][col] == 0) {
	
	                for (int c = 0; c < ar[row].length; c++) {
	                    if (ar[row][c] != 0)
	                        ar[row][c] = -1;
	                }
	
	                for (int r = 0; r < ar.length; r++) {
	                    if (ar[r][col] != 0)
	                        ar[r][col] = -1;
	                }
	            }
	        }
	    }
	
	    for (int row = 0; row < ar.length; row++) {
	        for (int col = 0; col < ar[row].length; col++) {
	            if (ar[row][col] == -1)
	                ar[row][col] = 0;
	        }
	    }
	}	
	// Better --> Tc: O(m*n), Sc: O(m+n)
	static void method1(int[][] ar) {	
	    int rows = ar.length;
	    int cols = ar[0].length;	
	    int[] rowMark = new int[rows];
	    int[] colMark = new int[cols];	
	    for (int row = 0; row < rows; row++) {
	        for (int col = 0; col < cols; col++) {
	            if (ar[row][col] == 0) {
	                rowMark[row] = -1;
	                colMark[col] = -1;
	            }
	        }
	    }	
	    for (int row = 0; row < rows; row++) {
	        for (int col = 0; col < cols; col++) {
	            if (rowMark[row] == -1 || colMark[col] == -1) {
	                ar[row][col] = 0;
	            }
	        }
	    }
	}	
	// Optimal --> Tc: O(m*n), Sc: O(1)
	static void method2(int[][] ar) {
	    int rows = ar.length;
	    int cols = ar[0].length;	
	    boolean firstRowZero = false;
	    boolean firstColZero = false;
	    // Check first row
	    for (int col = 0; col < cols; col++) {
	        if (ar[0][col] == 0) {
	            firstRowZero = true;
	            break;
	        }
	    }	
	    // Check first column
	    for (int row = 0; row < rows; row++) {
	        if (ar[row][0] == 0) {
	            firstColZero = true;
	            break;
	        }
	    }	
	    // Mark rows & columns
	    for (int row = 1; row < rows; row++) {
	        for (int col = 1; col < cols; col++) {
	            if (ar[row][col] == 0) {
	                ar[0][col] = 0;
	                ar[row][0] = 0;
	            }
	        }
	    }	
	    // Set zeroes based on marks
	    for (int row = 1; row < rows; row++) {
	        for (int col = 1; col < cols; col++) {
	            if (ar[0][col] == 0 || ar[row][0] == 0) {
	                ar[row][col] = 0;
	            }
	        }
	    }	
	    // Handle first row
	    if (firstRowZero) {
	        for (int col = 0; col < cols; col++) {
	            ar[0][col] = 0;
	        }
	    }	
	    // Handle first column
	    if (firstColZero) {
	        for (int row = 0; row < rows; row++) {
	            ar[row][0] = 0;
	        }
	    }
	}	
	public static void main(String[] args) {	
	    int[][] ar = {
	            {0, 1, 2, 0},
	            {3, 4, 0, 2},
	            {1, 3, 1, 5}
	    };	
	    method2(ar);	
	    System.out.println(Arrays.deepToString(ar));
	}
}
