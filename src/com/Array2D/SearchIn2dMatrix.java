package com.Array2D;

//https://leetcode.com/problems/search-a-2d-matrix-->(no overlapping case)
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Tc:O(log(n*m))

public class SearchIn2dMatrix {
	
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int sr=0,er=m-1;
        while(sr<=er){
            int mr=sr+(er-sr)/2;
            if(target>=matrix[mr][0] && target<=matrix[mr][n-1]){
                return searchInRow(matrix,target,mr);
            }
            else if(target>matrix[mr][n-1]){
                sr=mr+1;
            }
            else{
                er=mr-1;
            }
        }
        return false;
    }
    public static boolean searchInRow(int[][] matrix,int target,int mr){
        int n=matrix[mr].length;
        int s=0,e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==matrix[mr][m]){
                return true;
            }
            else if(target>matrix[mr][m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		System.out.println(searchMatrix(matrix,target));
	}

}
