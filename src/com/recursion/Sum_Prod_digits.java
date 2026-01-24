package com.recursion;

public class Sum_Prod_digits {

	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10)+sum(n/10);
	}
	static int prod(int n) {
		if(n==1) {
			return 1;
		}
		return (n%10)*prod(n/10);
	}
	public static void main(String[] args) {
		int n=12345;
		System.out.println(sum(n));
		System.out.println(prod(n));
	}

}
