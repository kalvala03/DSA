package com.binarysearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//852. Peak Index in a Mountain Array

//https://leetcode.com/problems/find-peak-element/
//162. Find Peak Element

public class PeakIndexInMountainArray {
	public static int Search(int[] arr) {
		int low=0;
		int high=arr.length-1;
		
		while(low!=high) {  
			int mid=low+(high-low)/2;
			if(arr[mid]<arr[mid+1]) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		return high;

	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,4,3,2};
		System.out.println(Search(arr));
		}

}
