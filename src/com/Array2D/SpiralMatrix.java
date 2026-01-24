package com.Array2D;

import java.util.ArrayList;
import java.util.List;

//Time Complexity: O(m × n)
//Space Complexity: O(m × n)
//54)https://leetcode.com/problems/spiral-matrix
public class SpiralMatrix {
	static List<Integer> method(int[][] ar){
		int m=ar.length,n=ar[0].length;
		int sr=0,sc=0,er=m-1,ec=n-1;
		List<Integer> ans=new ArrayList<>();
		while(sr<=er && sc<=ec) {
			//top
			for(int j=sc;j<=ec;j++) {
				ans.add(ar[sr][j]);
			}
			//right
			for(int i=sr+1;i<=er;i++) {
				ans.add(ar[i][ec]);
			}
			//left
			for(int j=ec-1;j>=sc;j--) {
				if(sr==er)
					break;
				ans.add(ar[er][j]);
			}
			//left
			for(int i=er-1;i>=sr+1;i--) {
				if(sc==ec)
					break;
				ans.add(ar[i][sc]);
			}
			sr++;er--;sc++;ec--;
		}
		return ans;
	}
	public static void main(String[] args) {
		int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(method(ar));
	}
}
