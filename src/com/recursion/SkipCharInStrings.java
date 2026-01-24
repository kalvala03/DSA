package com.recursion;

public class SkipCharInStrings {
	
	//approach 1-->passing the ans string in arguments
	static void fun(String ans,String given_str) {
		if(given_str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		char ch=given_str.charAt(0);
		
		if(ch=='a') {
			fun(ans,given_str.substring(1));
		}
		else {
			fun(ans+ch,given_str.substring(1));
		}
	}
	
	//approach 2-->create the ans variable in fub body
	static String fun2(String given_str) {
		if(given_str.isEmpty()) {
			return "";
		}
		
		char ch=given_str.charAt(0);
		
		if(ch=='a') {
			return fun2(given_str.substring(1));
		}
		else {
			return ch+fun2(given_str.substring(1));
		}
	}

	public static void main(String[] args) {
		fun("","baccdah");
		System.out.println(fun2("baccdah"));
	}

}
