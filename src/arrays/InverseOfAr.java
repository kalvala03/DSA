package arrays;

import java.util.Arrays;

public class InverseOfAr {

	static int[] method(int[] ar) {
		int[] temp=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			int val=ar[i];
			temp[val]=i;
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] ar= {2,3,1,0,4};
		System.out.println(Arrays.toString(method(ar)));
	}
}
