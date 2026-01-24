package com.binarysearch;

//https://leetcode.com/problems/split-array-largest-sum/
//410. Split Array Largest Sum
//Time Complexity: O(n × log(sum(nums))) & sc:O(1)

public class SplitArrayLargestSum {
	public static int splitArray(int[] nums, int k) {
	    int s = 0;
	    int e = 0;

	    // Step 1: define search space
	    for (int i = 0; i < nums.length; i++) {
	        s = Math.max(s, nums[i]); // minimum possible answer
	        e += nums[i];             // maximum possible answer
	    }

	    // Step 2: binary search on answer
	    while (s < e) {
	        int mid = s + (e - s) / 2;

	        int sum = 0;  //current subarray sum
	        int pieces = 1;  //number of subarrays formed

	        // Step 3: check how many subarrays needed
	        for (int num : nums) {
	            if (sum + num > mid) {
	                sum = num;   // If adding num exceeds mid:close current subarray,start a new one
	                pieces++;
	            } else {
	                sum += num;
	            }
	        }

	        // Step 4: adjust binary search
	        if (pieces > k) {
	            s = mid + 1;  // need larger max sum
	        } else {
	            e = mid;      // try smaller max sum
	        }
	    }

	    return e; // or return s (both are same here)
	}

	public static void main(String[] args) {
		int[] nums= {7,2,5,10,8};
		int k=2;
		System.out.println(splitArray(nums,k));
	}
}

/* 

👉 Split the array into k continuous (contiguous) subarrays
👉 Each subarray must have at least one element
👉 Among all subarrays, find the one with the maximum sum
👉 Make that maximum sum as small as possible
👉 Finally, return that minimum possible “largest subarray sum”.

This problem is solved using binary search on the answer.
For each candidate sum, a greedy approach checks feasibility by minimizing the number of subarrays.
 */
