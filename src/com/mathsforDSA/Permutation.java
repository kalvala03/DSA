package com.mathsforDSA;

public class Permutation {
	static int method(int n,int r) {
		int ans=1;
		for(int i=n;i>=n-r+1;i--) {
			ans*=i;
		}
		return ans;
	}

	public static void main(String[] args) {
		int n=5,r=3;
		System.out.print(method(n,r));	
	}
}
