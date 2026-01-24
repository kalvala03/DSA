package com.linearsearching;

public class FindMinNum {
	public static int findMin(int[] ar) {
		int min=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]<min) {
				return ar[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] ar= {2,6,9,0,4};
		System.out.println(findMin(ar));
	}

}
