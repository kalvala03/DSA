package arrays;

import java.util.Arrays;

public class RotateArrByKtimes {
	//Bruteforce-->Tc:O(n),Sc:O(k)
	public static void method(int[] nums,int k) {
		int n=nums.length;
		int[] temp=Arrays.copyOfRange(nums, n-k, n);
		
		for(int i=n-k-1;i>=0;i--) {
			nums[i+k]=nums[i];
		}
		for(int i=0;i<k;i++) {
			nums[i]=temp[i];
		}
	}
	
	//Optimized -->Tc:O(n),O(1)
	public static void rotateAr(int[] nums,int k,String direction) {
		int n=nums.length;
		k = k % n;   // rotating n times returns the original array, so only the remainder rotations matter even if k is large
		//case1:If rotation is to right
		if(direction.equals("right")) {
			rev(nums,0,n-1);
			rev(nums,0,k-1);
			rev(nums,k,n-1);
		}
		else if(direction.equals("left")) {
			rev(nums,0,k-1);
			rev(nums,k,n-1);
			rev(nums,0,n-1);
		}
		//case2:If rotation is to left
		
	}
	public static void rev(int[] nums,int s,int e) {
		while(s<e) {
			int t=nums[s];
			nums[s]=nums[e];
			nums[e]=t;
			s++;
			e--;
		}
	}
	

	public static void main(String[] args) {
		//int[] nums= {1,2,3,4,5,6,7};
		//int k=2;
		//method(nums,k);
		int[] nums= {1,2,3,4,5,6,7};
		int k=2;
		String direction="left";
		rotateAr(nums,k,direction);
		System.out.println(Arrays.toString(nums));
	}

}