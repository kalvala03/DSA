package com.recursion;

public class CountZeroes {

	static int count(int n) {
		return help_fun(n,0);
	}
	static int help_fun(int n,int c) {
		if(n==0) {
			return c;
		}
		if(n%10==0) {
			return help_fun(n/10,c+1);
		}else {
			return help_fun(n/10,c);
		}
	}
	public static void main(String[] args) {
		int n=30102;
		System.out.println(count(n));
	}

}
