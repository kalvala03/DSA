package com.mathsforDSA;

public class PrimesInRange {
/*
	// Timecomplexity --> O(n.√n),sc:O(1)
	static boolean isprime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n=40;
		for(int i=2;i<=n;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	*/
	
	//Sieve of Eratosthenes algorithm:Time complexity -->O(nloglogn)​,Sc:O(n)
	//https://leetcode.com/problems/count-primes
	static void method(int n, boolean[] primes) {
	    if (n < 2) return;  // 0 and 1 are not prime
	    for (int i = 2; i * i <= n; i++) {
	        // If i is prime
	        if (!primes[i]) {
	            // Start marking from i*i
	            for (int j = i * i; j <= n; j += i) {
	                primes[j] = true;
	            }
	        }
	    }
	    // Print primes
	    for (int i = 2; i <= n; i++) {
	        if (!primes[i]) {
	            System.out.print(i + " ");
	        }
	    }
	}

	public static void main(String[] args) {
		int n=40;
		boolean[] primes=new boolean[n+1];
		method(n,primes);
	}

}
