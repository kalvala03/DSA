package com.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void conquer(int ar[],int s,int mid,int e) {
		int temp[]=new int[e-s+1];
		int left=s;
		int right=mid+1;
		int x=0;
		
		while(left<=mid && right<=e) {
			if(ar[left]<=ar[right]) {
				temp[x] = ar[left];
				x++;
				left++;
			}
			else {
				temp[x]=ar[right];
				x++;
				right++;
			}
		}
		while(left<=mid) {
			temp[x++]=ar[left++];
		}
		while(right<=e) {
			temp[x++]=ar[right++];
		}
		
		//pushing back into original array
		for(int i=0; i<temp.length; i++) {
			 ar[i+s]=temp[i];
		}
		
	}

	public static void divide(int ar[],int s,int e) {
		if(s<e) {
			int mid=s+(e-s)/2;
			divide(ar,s,mid);    //calling divide method for dividing left part
			divide(ar,mid+1,e);   //call right part
			
			conquer(ar,s,mid,e);
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {9,2,4,3,8,6};
		divide(ar,0,ar.length-1);
		System.out.print(Arrays.toString(ar));
	}

}
