package com.mathsforDSA;

public class SumOfAPSeries {
	static int method(int n,int a,int d) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=a;
			a+=d;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n=4,a=2,d=2;
		System.out.println(method(n,a,d));
	}

}
