package com.BitwiseNumbersystem;

public class EvenOdd {

	static String isOdd(int n) {
		if((n&1)==1){     //if(n&1==1) then 'n' is odd, else even.
			return "Odd";
		}
		else {
			return "even";
		}
	}
	public static void main(String[] args) {
		int n=67;
		System.out.println(isOdd(n));
	}
 
 	/*static boolean isOdd(int n) {
		return (n&1)==1;   
	}
	public static void main(String[] args) {
		int n=68;
		System.out.println(isOdd(n));
	}*/
}
