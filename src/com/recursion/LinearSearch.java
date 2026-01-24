package com.recursion;

public class LinearSearch {

	static boolean find(int ar[],int key,int index) {
		//base case
		if(index==ar.length) {
			return false;
		}
		return ar[index]==key || find(ar,key,index+1);
	}
	
	static int findIndex(int ar[],int key,int index) {
		if(index==ar.length) {
			return -1;
		}
		if(ar[index]==key) {
			return index;
		}
		else
		{
			return findIndex(ar,key,index+1);
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {3,8,2,1,6,9};
		System.out.println(find(ar,9,0));
		System.out.println(findIndex(ar,9,0));
	}

}
