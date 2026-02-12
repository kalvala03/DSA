package binarysearchOn1D;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//34. Find First and Last Position of Element in Sorted Array

public class FirstLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);   // first occurrence
        ans[1] = search(nums, target, false);  // last occurrence

        return ans;
    }
    
    public static int search(int[] nums, int target, boolean findFirst) {
        int ans = -1;  //stores the answer when target is found
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } 
            else if (target > nums[mid]) {
                start = mid + 1;
            } 
            else {
                ans = mid;   // potential answer found

                if (findFirst) {
                    end = mid - 1;   // move left to find earlier occurrence
                } else {
                    start = mid + 1; // move right to find later occurrence
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}

//After finding the target in binary search, move left to find the first index and move right to find the last index.
//Arrays.toString() is used to print array elements; 
//printing array directly shows memory reference
