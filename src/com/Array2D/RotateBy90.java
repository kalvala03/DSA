package com.Array2D;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-image
public class RotateBy90 {

	//BruteForce-->TC:O(n^2),SC:O(n^2)
	static int[][] method(int[][] ar) {
		int n=ar.length;
		int[][] rotatedAr=new int[n][n];
		for(int r=0;r<n;r++) {
			for(int c=0;c<n;c++) {
				rotatedAr[c][n-r-1]=ar[r][c];
			}
		}
		return rotatedAr;
	}
	
	//Optimal-->TC:O(n^2),SC:O(1)
	static void method1(int[][] ar) {
		int n=ar.length;
		//transpose
		for(int r=0;r<n;r++) {
			for(int c=r+1;c<n;c++) {
				int temp=ar[r][c];
				ar[r][c]=ar[c][r];
				ar[c][r]=temp;
			}
		}
		//reverse
		for(int i=0;i<n;i++) {
			int p=0,q=n-1;
			while(p<q) {
				int temp=ar[i][p];
				ar[i][p]=ar[i][q];
				ar[i][q]=temp;
				p++;q--;
			}
		}	
	}
	
	public static void main(String[] args) {
		int[][] ar= {{0,1,1,2},{2,0,3,1},{4,5,0,5},{5,6,7,0}};
		//System.out.println(Arrays.deepToString(method(ar)));
		method1(ar);
		System.out.println(Arrays.deepToString(ar));
	}
}
