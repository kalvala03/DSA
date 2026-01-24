package com.binarysearch;

//540. Single Element in a Sorted Array-->https://leetcode.com/problems/single-element-in-a-sorted-array
//Tc:O(logn),Sc:O(1)

public class SingleEleInSortedArr {
	public static int method(int[] nums) {
		int s = 0, e = nums.length - 1;

        if (nums.length == 1) //edge case
            return nums[0];

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m == 0 && nums[0] != nums[1]) //edge case
                return nums[0];
            if (m == nums.length - 1 && nums[m] != nums[m - 1])  //edge case
                return nums[m];

            if (m > 0 && m < nums.length - 1 &&
                nums[m] != nums[m - 1] && nums[m] != nums[m + 1]) {
                return nums[m];
            }

            if (m % 2 == 0) {
                if (nums[m] == nums[m + 1]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            } else {
                if (nums[m] == nums[m - 1]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
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
