package com.mathsforDSA;

public class Replace0swith1sInInteger {
	static int method(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			if(rem==0) {
				rem=1;
			}
			rev=rev*10+rem;
			n/=10;
		}
		int res=0;
		while(rev>0) {
			res=res*10+(rev%10);
			rev/=10;
		}
		return res;
	}
	public static void main(String[] args) {
		int n=102003;
		System.out.println(method(n));
	}
}
