package com.arraysCyclicsort;

//Find the duplicate in an array (concept used- cyclic sort bcz in problem statement range given [0,n])
//https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;      
            if (nums[i] != nums[correctIndex]) {    
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } 
            else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++) {
        	if(nums[j]!=j+1) {
        		return nums[j];
        	}
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }
}

