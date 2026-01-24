package com.binarysearch;

public class BinarySearch {

	public static int binSearch(int[] ar,int key) {
		int low=0;
		int high=ar.length-1;
		
		while(low<=high) {
			//int mid=low+high/2;  this formula might exceeds the range of integer
			int mid=low+(high-low)/2;
			if(key<ar[mid]) {
				high=mid-1;
			}
			else if(key>ar[mid]) {
				low=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
		
	
	public static void main(String[] args) {
		int[] ar= {9,11,23,48,64,88,94};
		int key=94;
		System.out.println(binSearch(ar,key));
	}

}
