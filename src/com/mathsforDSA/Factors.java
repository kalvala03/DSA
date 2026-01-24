package com.mathsforDSA;

import java.util.ArrayList;

public class Factors {

	//Timecomplexity:O(n) and spacecomplexity:O(1)
	static void printFactors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	//Optimized--> Timecomplexity and Spacecomplexity :O(sqrt(n))
	static void printFactors2(int n) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				if(n/i==i)
					System.out.print(i+" ");
				else {					
					System.out.print(i+" ");
					list.add(n/i);
				}
			}
			
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		
	}
	public static void main(String[] args) {
		int n=6;
		printFactors2(n);
	}

}
