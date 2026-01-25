package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/rearrange-array-elements-by-sign

public class RearrangeEleBySign {
	//Bruteforce-----Tc:O(n + n/2)=O(n) and Sc:O(n/2 + n/2)=O(n)
	static int[] method(int[] nums) {
		List<Integer> pos=new ArrayList<>();
		List<Integer> neg=new ArrayList<>();
		
		//step 1:O(n)
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				pos.add(nums[i]);
			}
			else {
				neg.add(nums[i]);
			}
		}
		
		//step2:O(n/2)
		for(int i=0;i<nums.length/2;i++) {
			nums[2*i]=pos.get(i);
			nums[2*i+1]=neg.get(i);
		}
		return nums;
		
	}
	//Optimized---TC:O(n),Sc:O(n)
	static int[] method1(int[] nums) {
		int[] temp=new int[nums.length];
		int posIdx=0,negIdx=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				temp[posIdx]=nums[i];
				posIdx+=2;
			}
			else {
				temp[negIdx]=nums[i];
				negIdx+=2;
			}
		}
		int x=0;
		for(int i=0;i<temp.length;i++) {
			nums[x]=temp[i];
			x++;
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] nums= {3,1,-2,-5,2,-4};
		System.out.println(Arrays.toString(method1(nums)));
	}

}
