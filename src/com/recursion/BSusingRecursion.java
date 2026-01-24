package com.recursion;

public class BSusingRecursion {
	
	static int search(int[] ar,int key,int s,int e) {
		//base case
		if(s>e) {
			return -1;
		}
		
		int m=s+(e-s)/2;
		
		if(ar[m]==key) {
			return m;
		}
		else if(key<ar[m]) {
			return search(ar,key,s,m-1);
		}
		else {
			return search(ar,key,m+1,e);
		}
	}

	public static void main(String[] args) {
		int[] ar= {5,6,7,10,11};
		int key=10;
		System.out.println(search(ar,key,0,ar.length-1));
	}

}
