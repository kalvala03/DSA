package com.arraysCyclicsort;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
//(concept used- cyclic sort)

public class SetMismatch {
	public static int[] findErrorNums(int[] nums) {
		int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
            	//swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int idx= 0; idx < nums.length; idx++) {
            if (nums[idx] != idx+1) {
                return new int[] {nums[idx],idx+1};
            }
        }
        return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		int nums[] = {1,2,2,4};
		int[] ans=findErrorNums(nums);
		System.out.println(Arrays.toString(ans));

	}

}
