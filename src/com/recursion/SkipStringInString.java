package com.recursion;

public class SkipStringInString {

	static void fun(String ans,String given_str) {
		if(given_str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		char ch=given_str.charAt(0);
		
		if(given_str.startsWith("apple")) {
			fun(ans,given_str.substring(5));
		}
		else {
			fun(ans+ch,given_str.substring(1));
		}
	}
	
	//Skip a string if its not a required string
	static void fun2(String ans,String given_str) {
		if(given_str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		char ch=given_str.charAt(0);
		
		if(given_str.startsWith("app") && !given_str.startsWith("apple") ) {
			fun2(ans,given_str.substring(3));
		}
		else {
			fun2(ans+ch,given_str.substring(1));
		}
	}
	
		
	public static void main(String[] args) {
		fun("","bccappledd");
		fun2("","bccappledd");
		fun2("","bccappdd");
	}

}
