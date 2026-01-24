package arrays;

import java.util.Arrays;

//75. Sort Colors-->https://leetcode.com/problems/sort-colors

public class DitchNationalFlag_0s1s2s {
	
	//Brute force-->O(n logn)
	public static void sort1(int[] nums) {
		 Arrays.sort(nums); 
	}
		
	//optimized aproach 1:three pointers-->Tc:O(n), two pass
	public static void sort2(int[] nums) {
		int c1=0,c2=0,c3=0;
		 // Step 1: count 0s, 1s, and 2s
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0)
				c1++;
			else if(nums[i]==1)
				c2++;
			else
				c3++;
		}
		// Step 2: overwrite array		
		int idx = 0;
	    for (int i = 0; i < c1; i++)
	        nums[idx++] = 0;
	    for (int i = 0; i < c2; i++)
	        nums[idx++] = 1;
	    for (int i = 0; i < c3; i++)
	        nums[idx++] = 2;
	}
	
	//optimized aproach 2: DitchNationalFlag algorithm-->Tc:O(n), single pass
	public static void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                int t=nums[l];
                nums[l]=nums[m];
                nums[m]=t;
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                int t=nums[m];
                nums[m]=nums[h];
                nums[h]=t;
                h--;
            }
        }
    }
	
	public static void main(String[] args) {
		int[] nums= {2,0,2,1,1,0};
		sortColors(nums);   // just call the method as the return type is void
        System.out.println(Arrays.toString(nums)); // print array
	}

}
