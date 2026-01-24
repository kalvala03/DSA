package arrays;

import java.util.Arrays;

public class LargestEleInArray {
	//brute force-->Tc:O(n logn)
	public static int method(int[] ar) {
		Arrays.sort(ar); 
		return ar[ar.length-1];
	}
	//Optimized -->Tc:O(n)
	public static int method1(int[] ar) {
		int max=ar[0];
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] ar= {2,5,1,3,0};
		System.out.println(method1(ar));
	}

}
