package com.linearsearching;

import java.util.Arrays;

public class SearchIn2dArray {
	public static int[] search(int[][] ar,int key) {
		if(ar.length==0) {
			return new int[] {-1,-1};
		}
		for(int row=0;row<ar.length;row++) {
			for(int col=0;col<ar[row].length;col++) {
				if(ar[row][col]==key) {
					return new int[] {row,col};   
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int[][] ar= {
				{2,3,9},
				{1,6,4}
		};
		int key=3;
		int[] ans=search(ar,key);
		System.out.println(Arrays.toString(ans));

	}

}
