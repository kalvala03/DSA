package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/next-permutation----->Tc:O(n),sc:O(1)

public class NextPermutation {

	public static void method(int[] nums) {
		// Step 1: find the pivot (first index from right where nums[i] < nums[i+1])
        int pivot=-1, n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }

         // If no pivot found, array is in descending order
        // Reverse entire array to get smallest permutation
        if(pivot==-1){
            int p=0,q=n-1;
            while(p<q){
                int t=nums[p];
                nums[p]=nums[q];
                nums[q]=t;
                p++;q--;
            }
            return;
        }

        //step2:Next largest element
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int t=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=t;
                break;
            }
        }

        //step3:reverse the elements after pivot
        int i=pivot+1,j=n-1;
        while(i<j){
            int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;j--;
        }
    }
	public static void main(String[] args) {
		int[] nums= {1,2,3}; //123 → 132 → 213 → 231 → 312 → 321 → (back to) 123
		method(nums);
		System.out.println(Arrays.toString(nums)); 
	}

}
