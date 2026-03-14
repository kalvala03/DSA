package bsOn2D;

import java.util.Arrays;

public class RowWithMax1s {
	//Tc:O(m*n)
	static int[] method(int[][] ar) {
		int maxCt=0;
		int rowIndex = -1;
		for(int i=0;i<ar.length;i++) {
			int curCt=0;
			for(int j=0;j<ar[0].length;j++) {
				if(ar[i][j]==1) {
					curCt++;
				}
			}
			if(curCt > maxCt) {
				maxCt = curCt;
				rowIndex = i;
			}
		}
		return new int[] {rowIndex,maxCt};
	}
	//If sorted row-vise Tc:O(n*logm)
	static int method1(int[][] ar) {
		int maxCt=0;
		int rowIndex = -1;
		for(int i=0;i<ar.length;i++) {
			int curCt=ar.length-lowerBound(ar[i],1);
			if(curCt > maxCt) {
				maxCt = curCt;
				rowIndex = i;
			}
		}
		return rowIndex;
	}
	static int lowerBound(int[] ar,int x) {
		int l=0,h=ar.length-1;
		while(l<=h) {
			int m=l+(h-l)/2;
			if(ar[m]>=x) {
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		int[][] ar= {{0,0,1,1},{0,0,0,0},{0,0,0,1},{0,1,1,1}};
		System.out.println(Arrays.toString(method(ar)));
	}
}
