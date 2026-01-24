package com.Array2D;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/find-missing-and-repeated-values
//TC:O(n^2),SC:O(n)
public class Repeated_Missing {
	static int[] method(int[][] ar) {
		Set<Integer> s=new HashSet<>();
		int n=ar.length;
		int a=-1,b=-1;
		int expSum=(n*n)*(n*n+1)/2;
		int actSum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				actSum+=ar[i][j];
				if(s.contains(ar[i][j])) {
					a=ar[i][j];
				}
				else {
					s.add(ar[i][j]);
				}
			}
		}
		b=expSum+a-actSum;
		return new int[] {a,b};
	}

	public static void main(String[] args) {
		int[][] ar= {{9,1,7},{8,9,2},{3,4,6}};
		System.out.println(Arrays.toString(method(ar)));

	}

}
