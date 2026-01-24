package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	//In this algorithm,the smallest element get placed at the beginning after each pass
	//In one iteration,only one final swap performs
	//TC=O(n^2)  AP regression
	static void sort(int ar[]) {
		for(int i=0;i<ar.length-1;i++) {
			int smallest=i;   //index
			for(int j=i+1;j<ar.length;j++) {
				if(ar[smallest]>ar[j]) {
					smallest=j;
				}
			}
			int t=ar[smallest];
			ar[smallest]=ar[i];
			ar[i]=t;
		}
	}
	public static void main(String[]args) {
		int ar[]= {7,8,3,1,2};
		sort(ar);
		System.out.print(Arrays.toString(ar));
	}
}
