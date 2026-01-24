package com.recursion;

public class Printsnumbers {

	static void n_one(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		n_one(n-1);
	}
	static void one_n(int n) {
		if(n==0) {
			return;
		}
		one_n(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		int n=5;
		n_one(n);
		one_n(n);
	}

}
