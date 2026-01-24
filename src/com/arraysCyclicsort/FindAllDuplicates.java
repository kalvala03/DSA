package com.arraysCyclicsort;

import java.util.ArrayList;
import java.util.List;

//Find All Duplicates in an Array(concept used- cyclic sort bcz in problem statement range given [0,n])
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicates {
	public static List<Integer> findDuplicates(int[] nums) {
		 int i = 0;
	        while (i < nums.length) {
	            int correctIndex = nums[i] - 1;
	            if (nums[i] != nums[correctIndex]) {
	            	//swap
	                int temp = nums[i];
	                nums[i] = nums[correctIndex];
	                nums[correctIndex] = temp;
	            } else {
	                i++;
	            }
	        }

	        List<Integer> ans = new ArrayList<>();    //using list bcz o/p may not contain single ele in this case 
	        for (int idx = 0; idx < nums.length; idx++) {
	            if (nums[idx] != idx + 1) {
	                ans.add(nums[idx]);
	            }
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
	}

}
