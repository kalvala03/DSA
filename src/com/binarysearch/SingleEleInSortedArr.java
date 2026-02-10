package com.binarysearch;

//540. Single Element in a Sorted Array-->https://leetcode.com/problems/single-element-in-a-sorted-array
//Tc:O(logn),Sc:O(1)

public class SingleEleInSortedArr {
	  public static int method(int[] nums) {
	        int n=nums.length;
	        if(n==1)
	            return nums[0];
	        if(nums[0]!=nums[1])
	            return nums[0];
	        if(nums[n-1]!=nums[n-2])
	            return nums[n-1];
	        int l=1,h=n-2;
	        while(l<=h){
	            int m=l+(h-l)/2;
	            if(nums[m]!=nums[m+1] && nums[m]!=nums[m-1]){
	                return nums[m];
	            }
	            if((m%2==1 && nums[m]==nums[m-1]) || (m%2==0 && nums[m]==nums[m+1])){
	                l=m+1;
	            }
	            else{
	                h=m-1;
	            }
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		int[] nums= {1,1,2,3,3,4,4,8,8};
		//int[] nums= {3,3,7,7,10,11,11};
		System.out.println(method(nums));
	}

}
