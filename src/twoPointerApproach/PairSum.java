package twoPointerApproach;

import java.util.Arrays;

//works only when array is sorted (Tc:O(n))
public class PairSum {
	public static int[] find(int[] nums,int target){
		int i=0;
		int j=nums.length-1;
		while(i<j) {
			int sum=nums[i]+nums[j];
			if(sum>target) {
				j--;
			}
			else if(sum<target) {
				i++;
			}
			else {
				return new int[] {i,j};
			}
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int target=9;
		System.out.println(Arrays.toString(find(nums,target)));
	}

}
