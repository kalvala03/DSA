package com.BitwiseNumbersystem;

//TimeComplexity is log(n)  bcz time depends here based on no of binary digits

public class MagicNumber {
	public static void main(String[] args) {
		int n=6;
		int ans=0;
		int base=5;
		
		while(n>0) {
			int last=n&1;   //gives last binary digit of the given num
			n=n>>1;
			ans+=last*base;   //ans=ans+(last*base)
			base*=5;   //base=base*5;			
		}
		System.out.println(ans);
	}

}
