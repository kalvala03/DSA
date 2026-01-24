package com.arraysCyclicsort;

//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//(concept used- cyclic sort)
//https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPostive {
	public static int firstMissingPositive(int[] ar) {
		int i = 0;
        while (i < ar.length) {
            int correct = ar[i]-1;
            if (ar[i]>0 && ar[i] <= ar.length && ar[i] != ar[correct]) {
                int temp = ar[i];
                ar[i] = ar[correct];
                ar[correct] = temp;
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int idx = 0; idx < ar.length; idx++) {
            if (ar[idx] != idx+1) {
                return idx+1;
            }
        }
        return ar.length+1;
	        
	    }

	public static void main(String[] args) {
		//int ar[]={1,2,3};
		//int ar[] ={3,4,-1,1};
		int ar[] = {7,8,9,11,12};
        int missing = firstMissingPositive(ar);
        System.out.println(missing);
	}

}
