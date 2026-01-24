package twoPointerApproach;
import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroes {

	//BruteForce-->Tc:O(n),Sc:O(n)
	public static void method(int[] nums) {
		int[] temp=new int[nums.length];
		int x=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				temp[x]=nums[i];
				x++;
			}
		}
		for(int i=0;i<nums.length;i++) {
			nums[i]=temp[i];
		}
	}
	//Optimal-->Tc:O(n),Sc:O(1)
	public static void method1(int[] nums) {
		int n=nums.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(nums[i]!=0) {
				int t=nums[i];
				nums[i]=nums[j];
				nums[j]=t;
				j++;
			}
		}
	}
	public static void main(String[] args) {
		int[] nums= {1,0,2,3,0,4,0,1};
		method(nums);
		System.out.println(Arrays.toString(nums));
	}
}
