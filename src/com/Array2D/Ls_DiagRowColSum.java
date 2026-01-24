package com.Array2D;

public class Ls_DiagRowColSum {
	//Time Complexity: O(n × m)--(n = rows, m = columns)
	static boolean method(int[][] ar,int key) {
		for(int r=0;r<ar.length;r++) {
			for(int c=0;c<ar[r].length;c++) {
				if(ar[r][c]==key) {
					return true;
				}
			}
		}
		return false;
	}
	
	//Maximum row sum
	static int maxRowSum(int[][] ar) {
		int maxsum= Integer.MIN_VALUE;
		for(int r=0;r<ar.length;r++) {
			int sum=0;
			for(int c=0;c<ar[r].length;c++) {
				sum+=ar[r][c];
			}
			maxsum=Math.max(maxsum, sum);
		}
		return maxsum;
		
	}
	
	//Maximum col sum
	static int maxColSum(int[][] ar) {
		int maxsum = Integer.MIN_VALUE;

		for (int c = 0; c < ar[0].length; c++) {
			int sum = 0;
			for (int r = 0; r < ar.length; r++) {
				sum += ar[r][c];
			}
			if (sum > maxsum) {
				maxsum = sum;
			}
		}
		return maxsum;
	}
	
	static int diagSum(int[][] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i][i];    // primary diagonal( ij are same )
			if(i!=ar.length-i-1) {   // avoid double-counting middle element
				sum+=ar[i][ar.length-i-1];  // secondary diagonal
			}
		}
		return sum;
	}

	
	public static void main(String[] args) {
		int[][] ar= {{1,2,3},{9,9,7},{7,8,9}};
		int key=5;
		System.out.println(method(ar,key));
		System.out.println(maxRowSum(ar));
		System.out.println(maxColSum(ar));
		System.out.println(diagSum(ar));
		
		/*
		//printing specific element from the 2d array
		System.out.println(ar[1][1]); 
		
		//printing 2d array in matrix format
		for(int r=0;r<ar.length;r++) {
			for(int c=0;c<ar[r].length;c++) {
				System.out.print(ar[r][c]+" ");
			}
			System.out.println();
		}
		*/
	}
}
