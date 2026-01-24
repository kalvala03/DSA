package com.sorting;

import java.util.Arrays;

public class InsertionSort {
	//TC:O(n^2)
	static void sort(int ar[]) {
		for(int i=0;i<ar.length;i++){
			int current=ar[i];  //1st element from unsorted part
			int j=i-1; //last part in sorted element
			while(j>=0 && current<ar[j]) {
				ar[j+1]=ar[j];
				j--;
			}
			//placement
			ar[j+1]=current;
		}
	}
	public static void main(String[]args) {
		int ar[]= {7,8,3,1,2};
		sort(ar);
		System.out.print(Arrays.toString(ar));
	}
}
