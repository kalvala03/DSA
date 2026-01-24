package com.linearsearching;

//Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
	public static int findNumber(int[] nums) {
		int c=0;
	        for(int n:nums) {
	        	if(digits(n)%2==0) {
	        		c++;
	        	}
	        }
	        return c;
	 }	
	public static int digits(int n) {
		if(n<0) {
			n=-n;
		}
		
		if(n==0) {
			return 1;
		}
		
		int c=0;
		while(n>0) {
			c++;
			n/=10;
		}
		return c;
	}
	/*public static int digits2(int n) {
		return (int)(Math.log10(n))+1;
	} */
	
	public static void main(String[] args) {
		int[] nums= {555,901,482,22,1771};
		System.out.println(findNumber(nums));
	}
}

