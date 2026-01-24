package com.recursion;

public class Reverse_num {

	static int rev=0;
	static void rev(int n) {
		if(n==0) {
			return;
		}
		rev=rev*10+(n%10);
		rev(n/10);
	}
	public static void main(String[] args) {
		rev(12345);
		System.out.println(rev);
	}

}
