package com.recursion;

public class Fibonnaci {

	static int Fib(int n) {
		//Base case
		if(n<2) {
			return n;
		}
		return Fib(n-1)+Fib(n-2);
	}
	
	public static void main(String[] args) {
		int ans=Fib(6);
		System.out.println(ans);
	}

}
