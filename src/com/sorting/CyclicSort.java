package com.sorting;

import java.util.Arrays;
// use cyclic sort when given no's range from 1 to N.  TC:O(n) and SC:O(1)
//note:0 to n -->correct idx=val    1 to n -->correct idx=val-1
 

public class CyclicSort {
	public static void sort(int ar[]) {
		int i=0;
		while(i<ar.length) {
			int cur_idx=ar[i]-1;
			if(ar[i]!=ar[cur_idx]) {   //if ele at index != ele at correct idx
				swap(ar,i,cur_idx);   //swapping ar[i],ar[correct]
			}else {
				i++;
			}
		}
	}

	private static void swap(int[] ar, int x, int y) {
		int k=ar[x];
		ar[x]=ar[y];
		ar[y]=k;
		
	}

	public static void main(String[] args) {
		int ar[]= {3,5,2,1,4};
		sort(ar);
		System.out.println(Arrays.toString(ar));
	}

}
