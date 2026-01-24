package com.recursion;

//1342. Number of Steps to Reduce a Number to Zero
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero

public class NoOfSteps {

	public static int numberOfSteps(int num) {
        return help_fun(num,0);
    }	
	
	public static int help_fun(int num, int steps) {
		if(num==0) {
			return steps;
		}
		if(num%2==0) {
			return help_fun(num/2,steps+1);
		}
		else {
			return help_fun(num-1,steps+1);
		}
	}

	public static void main(String[] args) {
		int num=14;
		System.out.println(numberOfSteps(num));
	}

}
