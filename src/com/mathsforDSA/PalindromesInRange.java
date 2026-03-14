package com.mathsforDSA;

public class PalindromesInRange {
	static void method(int start,int end) {
		for(int i=start;i<end;i++) {
			if(isPalindrome(i)){
				System.out.print(i+" ");
			}
		}
	}
	static boolean isPalindrome(int n) {
		int t=n;
		int rev=0;
		while(t>0) {
			int rem=t%10;
			rev=rev*10+rem;
			t/=10;
		}
		if(n==rev) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int start=10,end=50;
		method(start,end);
	}
}
