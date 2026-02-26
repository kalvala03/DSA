package com.mathsforDSA;

public class TrailingZeroesInFactorial {
	static int method(int n) {
		int res=0;
		int prod=5;
		while(n>=prod) {
			res+=(n/prod);
			prod=prod*5;
		}
		return res;
	}

	public static void main(String[] args) {
		int n=200;
		System.out.println(method(n));
	}
}
