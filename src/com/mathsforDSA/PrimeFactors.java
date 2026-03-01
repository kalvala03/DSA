package com.mathsforDSA;

//TC:Squareroot(n)log(n)
public class PrimeFactors {
	static void method(int n) {
		int i=2;
		while(i*i<=n) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
		if(n>1) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		int n=900;
		method(n);
	}
}
