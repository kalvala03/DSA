package com.arraysCyclicsort;

import java.util.*;

//Find all missing numbers in an Array(concept used- cyclic sort bcz in problem statement range given [1,n])
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class NumbersDisappeared {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
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
                ans.add(idx + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
