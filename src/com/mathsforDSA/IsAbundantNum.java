package com.mathsforDSA;

public class IsAbundantNum {
	static String method(int n) {
		int sum=1;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				if(n/i!=i) {
					sum+=i+n/i;
				}
				else {
					sum+=i;
				}
			}
		}
		if(sum>n) {
			return "Abundant";
		}
		else {
			return "Not Abundant";
		}
	}

	public static void main(String[] args) {
		int n=18;
		System.out.print(method(n));
	}
}
