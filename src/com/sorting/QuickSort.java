package com.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void Qs(int ar[],int s,int e) {
		if(s<e) {
			int pvidx=partition(ar,s,e);
			Qs(ar,s,pvidx-1);   //left part
			Qs(ar,pvidx+1,e);	//right part
		}
	}
	public static int partition(int ar[],int s,int e) {
		int pivot=ar[e];
		int idx=s-1;
		for(int j=s;j<e;j++) {
			if(ar[j]<=pivot) {
				idx++;
				//swap(ar[j],ar[idx]);
				int t1 = ar[j];
		        ar[j] = ar[idx];
		        ar[idx] = t1;
			}
		}
		idx++;
		//swap(ar[idx],ar[e]);
		int t2 = ar[idx];
        ar[idx] = ar[e];
        ar[e] = t2;
		return idx;
		
	}
	
	public static void main(String[] args) {
		int ar[]= {6,8,2,4,3,1};
		Qs(ar,0,ar.length-1);
		System.out.println(Arrays.toString(ar));
	}
}
