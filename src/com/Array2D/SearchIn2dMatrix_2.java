package com.Array2D;

//https://leetcode.com/problems/search-a-2d-matrix-ii --(overlapping case)
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
//Tc:O(m+n)

public class SearchIn2dMatrix_2 {
	public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int r=0,c=n-1;
        while(r<m && c>=0){
            if(target==matrix[r][c]){
                return true;
            }
            else if(target<matrix[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		int[][] matrix= {
				{1,4,7,11,15},
				{2,5,8,12,19},	
				{3,6,9,16,22},	
				{10,13,14,17,24},
				{18,21,23,26,30}
				};
		int target=5;
		System.out.println(searchMatrix(matrix,target));
	}

}
