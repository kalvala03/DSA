package com.arraysCyclicsort;


import java.util.Arrays;

public class ReverseArray {
	/*
	//Naive approach using temp array: Time & space complexity ->O(n)
	static void reverseArray(int arr[]) {
		int n=arr.length;
		int temp[]=new int[n];  //created empty array named temp with size n.
		//copy the original array elements into the temp array in reverse order
		for(int i=0;i<n;i++) {
			temp[i]=arr[n-i-1];   //here i starts from 0 t0 n
		}
		//again copy the elements of temp array back to the original array
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
		System.out.println(Arrays.toString(arr));
	} 
	
	//Optimized approach-1 using pointers: Time complexity-O(n) & space complexity-O(1)
	static void reverseArray(int arr[]) {
		int p=0;
		int q=arr.length-1;
		while(p<q) {
			int t=arr[p];
			arr[p]=arr[q];
			arr[q]=t;
			p++;
			q--;
		}
		System.out.println(Arrays.toString(arr));
	}  
	
	*/
	
	//Optimized approach-2 by swapping: Time complexity-O(n) & space complexity-O(1)
		static void reverseArray(int arr[]) {
			int n=arr.length;
			for(int i=0;i<n/2;i++) {
				int t=arr[i];
				arr[i]=arr[n-i-1];
				arr[n-i-1]=t;
			}
			System.out.println(Arrays.toString(arr));
		}

	public static void main(String[] args) {
		//original array
		int arr[]= {1,2,3,4,5,6};
		reverseArray(arr);
		
	}

}
