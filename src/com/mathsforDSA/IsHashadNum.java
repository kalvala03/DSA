package com.mathsforDSA;

public class IsHashadNum {
	static boolean method(int n) {
		int sum=0,t=n;
		while(t>0) {
			int r=t%10;
			sum+=r;
			t/=10;
		}
		if(n%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n=378;
		System.out.print(method(n));
	}
}
