package arrays;

import java.util.Arrays;
//169. Majority Element-->https://leetcode.com/problems/majority-element

//(works if definetly ans exists)
public class MajorityElement_Moore {
	
	//Brute force-->Tc:O(n^2)
	public static int majEle(int[] nums) {
		for(int val:nums) {
			int c=0;
			for(int ele:nums) {
				if(ele==val) {
					c++;
				}
			}
			if(c>nums.length/2) {
				return val;
			}
		}
		return -1;
	}
	
	//Optimized: Using Sorting-->Tc:O(nlogn)
	public static int majEle1(int[] nums) {
		Arrays.sort(nums);
		int c=1,ans=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				c++;
			}
			else {
				c=1;
				ans=nums[i];
			}
			if(c>nums.length/2) {
				return ans;
			}
		}
		return -1;
	}
	
	//Moore voting Algorithm-->Tc:O(n)
	public static int majEle2(int[] nums) {
		int c=0,ans=0;
		for(int i=0;i<nums.length;i++) {
			if(c==0) {
				ans=nums[i];
			}
			if(ans==nums[i]) {
				c++;
			}
			else {
				c--;
			}
		}
		return ans;
	}
	
	// Moore's Voting Algorithm (works even when majority may not exist)
	public static int majEleVariation(int[] nums) {

	    // Phase 1: Find the ele
	    int c = 0, ans = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (c == 0) {
	            ans = nums[i];
	        }
	        if (nums[i] == ans) {
	            c++;
	        } else {
	            c--;
	        }
	    }

	    // Phase 2: Verify the ele
	    c = 0;
	    for (int val : nums) {
	        if (val == ans) {
	            c++;
	        }
	    }

	    if (c > nums.length / 2) {
	        return ans;
	    }

	    return -1; // no majority element
	}

	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2};
		System.out.println(majEle2(nums));
		//int[] nums= {1,2,3};
		//System.out.println(majEleVariation(nums));
		
	}
}
