package arrays;

import java.util.Arrays;

//238. Product of Array Except Self-->https://leetcode.com/problems/product-of-array-except-self
public class ProdOfArrExceptSelf {
	
	//brute force-->Tc:O(n^2)
	public static int[] method(int[] nums) {
		int[] ans = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int prod=1;
			for(int j=0;j<nums.length;j++) {
				if(i!=j) {
					prod*=nums[j];
				}
			}
			ans[i]=prod;
		}
		return ans;
	}
	
	//Optimized approach1-->Tc:O(n),Sc:O(n)
	public static int[] method1(int[] nums) {
		int[] ans = new int[nums.length];
		int[] prefix = new int[nums.length];
		int[] suffix = new int[nums.length];
		
		//prefix
		prefix[0] = 1; 
		for(int i=1;i<nums.length;i++) {
			prefix[i]=prefix[i-1]*nums[i-1];
		}
		
		//suffix
		suffix[nums.length-1]=1;
		for(int i=nums.length-2;i>=0;i--) {
			suffix[i]=suffix[i+1]*nums[i+1];
		}
		
		//ans
		for(int i=0;i<nums.length;i++) {
			ans[i]=prefix[i]*suffix[i];
		}
		
		return ans;
	}
	
	//Optimized approach2-->Tc:O(n),Sc:O(1)
		public static int[] method2(int[] nums) {
			int[] ans = new int[nums.length];
			
			//prefix-->ans
			ans[0] = 1;
			for(int i=1;i<nums.length;i++) {
				ans[i]=ans[i-1]*nums[i-1];
			}
			
			//suffix
			int suffix=1;
			for(int i=nums.length-2;i>=0;i--) {
				suffix*=nums[i+1];
				ans[i]*=suffix;
			}
						
			return ans;
		}
		
		//Optimized approach using '/' operator---->Tc:O(n),Sc:O(1)
		public static int[] meth(int[] nums) {
			int[] ans = new int[nums.length];
			int prod=1;
			for(int i=0;i<nums.length;i++) {
				prod*=nums[i];
			}
			for(int i=0;i<nums.length;i++) {
				ans[i]=prod/nums[i];
			}
			return ans;
		}
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		//int[] nums= {-1,1,0,-3,3};
		System.out.println(Arrays.toString(meth(nums)));
	}

}
