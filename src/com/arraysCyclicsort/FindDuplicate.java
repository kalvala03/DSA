package com.arraysCyclicsort;

//Find the duplicate in an array (concept used- cyclic sort bcz in problem statement range given [0,n])
//https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            int correctIndex = nums[i] - 1;      // Correct position for nums[i]

            if (nums[i] != nums[correctIndex]) {    // If number is not at correct position

                // swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;

            } 
            // Number is already at its correct position → duplicate
            else if (i != correctIndex) {
                return nums[i];
            } 
            // Number already placed correctly
            else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }
}

