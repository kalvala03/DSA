package com.sorting;

import java.util.Arrays;

//In this algorithm,the largest element moves to the end after each pass
//in every iteration adjacent elements are swapped if not in correct order.

public class BubbleSort {
	
	static void sort(int ar[]) {
		//Tc:O(n^2)   not a optimized Tc
		//After every pass of outer loop,the largest element gets placed at the end
		for(int i=0;i<ar.length-1;i++) {
			//in the next pass,we don't need to check that last element again
			for(int j=0;j<ar.length-i-1;j++) {    
				if(ar[j]>ar[j+1]) {
					int t=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
				}
			}
			
		}
	}
	public static void main(String[]args) {
		int ar[]= {7,8,3,1,2};
		sort(ar);
		System.out.print(Arrays.toString(ar));
	}
}
