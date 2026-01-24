package com.binarysearch;

//https://leetcode.com/problems/find-in-mountain-array/
//1095. Find in Mountain Array

public class FindInMountainArray {
	public static int findInMountainArray(int target, int[] arr) {
	        int peak=peakSearch(arr);
	        int firsthalf=binSearch(arr,target,0,peak);
	        if(firsthalf!=-1) {
	        	return firsthalf;
	        }
	        return binSearch(arr,target,peak+1,arr.length-1);
	}
	public static int peakSearch(int[] arr) {
		int low=0;
		int high=arr.length-1;
		
		while(low!=high) {  
			int mid=low+(high-low)/2;
			if(arr[mid]<arr[mid+1]) {
				low=mid+1;;
			}
			else {
				high=mid;
			}
		}
		return high;
	}
	public static int binSearch(int[] ar,int key,int low,int high) {		
		boolean isAsc= ar[low]<ar[high];		
		while(low<=high) {
			//int mid=low+high/2;  this formula might exceeds the range of integer
			int mid=low+(high-low)/2;
			
			if(key==ar[mid]) {
				return mid;
			}
			if(isAsc) {
				if(key<ar[mid]) {
					high=mid-1;
				}
				else{
					low=mid+1;
				}
			}
			else {
				if(key<ar[mid]) {
					low=mid+1;
				}
				else{
					high=mid-1;	
				}
			}		
		}
		return -1;
	}		
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,3,1};
		//int[] arr= {1,2,4,5,3,1};
		int target=3;
		System.out.println(findInMountainArray(target,arr));
	}
}
