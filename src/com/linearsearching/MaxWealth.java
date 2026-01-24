package com.linearsearching;

//1672. Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {

	public static int maximumWealth(int[][] accounts) {
	        int max=0;
	        for(int row=0;row<accounts.length;row++) {
	        	int row_sum=0;
	        	for(int col=0;col<accounts[row].length;col++) {
	        		row_sum+=accounts[row][col];
	        	}
	        	if(row_sum>max) {
	        		max=row_sum;
	        	}
	        }
	        return max;
	 }
	public static void main(String[] args) {
		int[][] accounts= {{1,2,3},{3,2,1}};
		System.out.println(maximumWealth(accounts));

	}

}
