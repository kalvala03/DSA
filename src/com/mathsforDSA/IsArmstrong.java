package com.mathsforDSA;

public class IsArmstrong {
	public static boolean method(int n) {
		int M=n;
		int sum=0;
		while(M>0) {
			int rem=M%10;
			sum = sum+rem*rem*rem;
			M/=10;
		}
		if(n==sum) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n=153;
		System.out.println(method(n));

	}

}
