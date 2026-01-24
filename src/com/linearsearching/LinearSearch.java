package com.linearsearching;

public class LinearSearch {
	public static int search(int[] ar,int key) {
		if(ar.length==0) {
			return -1;
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==key) {
				return i;   
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] ar= {1,2,5,2,7};
		int key=5;
		System.out.println(search(ar,key));

	}

}
