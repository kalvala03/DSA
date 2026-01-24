package com.recursion;

public class CheckIfArraySorted {

	static boolean fun(int[] ar,int index) {
		//base cond
		if(index==ar.length-1) {
			return true;
		}
		return ar[index]<ar[index+1] && fun(ar,index+1);
	}
	public static void main(String[] args) {
		int ar[]= {1,2,3,4};
		System.out.println(fun(ar,0));
	}

}
