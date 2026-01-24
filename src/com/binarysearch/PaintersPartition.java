package com.binarysearch;

/*Painter's Partition Problem Given are N boards of length of each given in the form of array,
  and Mpainters, such that each painter takes 1 unit of time to paint 1 unit of the board.
  The task is to find the minimum time to paint all boards under the constraints 
  that any painter will only paint continuous sections of boards.*/
public class PaintersPartition {

	public static int meth(int[] boards, int k) {

	    int s = 0;
	    int e = 0;

	    // Search space
	    for (int b : boards) {
	        s = Math.max(s, b);  // longest single board
	        e += b;              // one painter paints everything
	    }

	    while (s < e) {
	        int mid = s + (e - s) / 2;

	        int time = 0;
	        int painters = 1;

	        for (int b : boards) {
	            if (time + b > mid) {
	                time = b;
	                painters++;
	            } else {
	                time += b;
	            }
	        }

	        if (painters > k) {
	            s = mid + 1;
	        } else {
	            e = mid;
	        }
	    }

	    return s; // minimum time
	}

	public static void main(String[] args) {
		int[] boards= {40,30,10,20};
		int k=2;
		System.out.println(meth(boards,k));
	}

}
