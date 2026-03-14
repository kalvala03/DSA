package com.mathsforDSA;

public class IsPerfectNum {
	//Bruteforce-O(n)
	static boolean method(int n) {
		int sum=1;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	//Optimal-O(squareroot(n))
	static boolean method1(int n) {
		int sum=1;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				if(i!=n/i) {
					sum+=i+n/i;
				}
				else {
					sum+=i;
				}
			}
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=6;
		System.out.println(method1(n));
	}
}
