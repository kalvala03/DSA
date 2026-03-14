package com.mathsforDSA;

public class FibonacciUptoNthTerm {
	//0-based indexing Fibonacci series upto nth term.
	static void method(int n) {
		int a=0,b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<=n;i++) {
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	//Print nth fibonacci(not 0- based)
	static void method1(int n) {
	    int a=0,b=1;
	    if(n==0) {
	        System.out.print(a);
	        return;
	    }
	    for(int i=2;i<n;i++) {
	        int c=a+b;
	        a=b;
	        b=c;
	    }
	    System.out.print(b);
	}

	public static void main(String[] args) {
		int n=5;
		method1(n);
	}
}
