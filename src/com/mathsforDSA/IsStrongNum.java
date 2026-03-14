package com.mathsforDSA;

public class IsStrongNum {
	static boolean method(int n) {
		int sum=0,t=n;
		while(t>0) {
			int r=t%10;
			sum+=fact(r);
			t/=10;
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static int fact(int r) {
		int fact=1;
		for(int i=r;i>=1;i--) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n=145;
		System.out.print(method(n));
	}
}
