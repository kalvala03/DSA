package com.mathsforDSA;

public class SumOfGPSeries {
	static int method(int n,int a,int r) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=a;
			a*=r;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n=2,a=3,r=5;
		System.out.println(method(n,a,r));
	}

}
