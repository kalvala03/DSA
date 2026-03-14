package com.mathsforDSA;

public class LeapYear {
	static boolean method(int year) {
		if((year%4==0) &&(year%100!=0)||(year%400==0)) {
			return true;
		}else {
			return false;
		}		
	}

	public static void main(String[] args) {
		int year=2020;
		System.out.println(method(year));
	}
}
