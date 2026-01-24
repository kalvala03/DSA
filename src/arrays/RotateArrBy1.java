package arrays;

import java.util.Arrays;

public class RotateArrBy1 {

	//Bruteforce-->Tc:O(n),Sc:O(K)
	public static void method(int[] ar) {
		int[] temp=new int[ar.length];
		for(int i=1;i<ar.length;i++) {
			temp[i-1]=ar[i];
		}
		temp[ar.length-1]=ar[0];
		
		for(int i=0;i<temp.length;i++) {
			ar[i]=temp[i];
		}
	}
	
	//Optimal-->Tc:O(n),O(1)
	public static void method1(int[] ar) {
		int temp=ar[0];
		for(int i=1;i<ar.length;i++) {
			ar[i-1]=ar[i];
		}
		ar[ar.length-1]=temp;
	}
	
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5};
		method1(ar);
		System.out.println(Arrays.toString(ar));
	}

}
