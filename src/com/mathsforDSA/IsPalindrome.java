package com.mathsforDSA;

public class IsPalindrome {
	//Approach1:O(logbase10(n))
	public static boolean method(int n) {
		int M=n;
		int rev=0;
		while(M>0) {
			int rem=M%10;
			rev = rev * 10 + rem;
			M/=10;
		}
		if(n==rev) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=1211;
		System.out.println(method(n));

	}

}
