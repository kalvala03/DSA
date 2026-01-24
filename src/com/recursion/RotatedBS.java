package com.recursion;

public class RotatedBS {

	static int search(int[] ar, int key,int s, int e) {
		
		if(s>e) {  //base condition
			return -1;
		}
		int m=s+(e-s)/2;
		
		if(ar[m]==key) {
			return m;
		}
			
		if(ar[s]<ar[m]) {   //if sorted
			if(key>=ar[s] && key<= ar[m]) {
				return search(ar,key,s,m-1);
			}
			else {
				return search(ar,key,m+1,e);
			}
		}
		if(key>ar[m] && key<ar[e]) {  //if not sorted
			return search(ar,key,m+1,e);
		}
		return search(ar,key,s,m-1);
	}
	public static void main(String[] args) {
		int[] ar= {5,6,7,1,2,3};
		System.out.println(search(ar,1,0,ar.length-1));

	}

}
