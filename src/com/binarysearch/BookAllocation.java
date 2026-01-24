package com.binarysearch;

/* Book Allocation Problem There are N books, each ith book has A[i] number of pages.
 You have to allocate books to M number of students so that the maximum number of pages allocated to a student is minimum.
 Each book should be allocated to a student.
 Each student has to be allocated at least one book Allotment should be in contiguous order. 
 Calculate and return that minimum possible number. Return -1 if a valid assignment is not possible.*/
public class BookAllocation {
	public static int allocateBooks(int[] nums, int k) {

	    if (k > nums.length) return -1;  // ❗ mandatory check

	    int s = 0;
	    int e = 0;

	    // search space
	    for (int num : nums) {
	        s = Math.max(s, num);  // at least max pages of a single book
	        e += num;              // at most all pages to one student
	    }

	    while (s < e) {
	        int mid = s + (e - s) / 2;

	        int sum = 0;
	        int students = 1;

	        for (int num : nums) {
	            if (sum + num > mid) {
	                sum = num;
	                students++;
	            } else {
	                sum += num;
	            }
	        }

	        if (students > k) {
	            s = mid + 1;
	        } else {
	            e = mid;
	        }
	    }

	    return s;
	}
	public static void main(String[] args) {
		int[] nums= {2,1,3,4};
		int k=2;
		System.out.println(allocateBooks(nums,k));
	}

}
