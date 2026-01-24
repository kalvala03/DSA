package com.BitwiseNumbersystem;

//https://leetcode.com/problems/single-number
//136.Single number

public class FindUnique_SingleNum {

	static int find(int[] ar) {
		int ans=0;
		for(int n:ar) {
			ans^=n;
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] ar= {2,3,3,4,2,6,4};
		System.out.println(find(ar));
	}

}
