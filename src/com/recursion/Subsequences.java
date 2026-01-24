package com.recursion;

public class Subsequences {
	static void fun(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch=up.charAt(0);
		fun(p+ch,up.substring(1));
		fun(p,up.substring(1));
	}

	public static void main(String[] args) {
		fun("","abc");
	}

}
