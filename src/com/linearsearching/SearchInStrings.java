package com.linearsearching;

/*
public class LinearSearchInStrings {
	public static boolean search(String str,char key) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==key) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str="Kalyani";
		char key='u';
		System.out.println(search(str,key));

	}

}
*/
//Search in range
public class SearchInStrings {
	public static boolean search(String str,char key,int start,int end) {
		if(str.length()==0) {
			return false;
		}
		for(int i=start;i<=end;i++) {
			if(str.charAt(i)==key) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str="Kalyani";
		char key='a';
		System.out.println(search(str,key,0,4));

	}

}