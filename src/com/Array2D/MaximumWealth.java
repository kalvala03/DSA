package com.Array2D;

public class MaximumWealth {
	static int method(int[][] ar) {
		int maxSum=0;
		for(int r=0;r<ar.length;r++) {
			int rowSum=0;
			for(int c=0;c<ar[r].length;c++) {
				rowSum+=ar[r][c];
			}
			maxSum=Math.max(maxSum, rowSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[][] ar= {{1,2,3},{3,1,1}};
		System.out.println(method(ar));
	}

}
