package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array
//Tc:O(m+n),Sc:O(1)

public class MergeSortedArrays {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,idx=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[idx]=nums1[i];
                idx--;i--;
            }
            else{
                nums1[idx]=nums2[j];
                j--;idx--;
            }
        }
        while(j>=0){
            nums1[idx]=nums2[j];
            idx--;j--;
        }
    }

	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		int m=3;
		int n=3;
		merge(nums1,m,nums2,n);
		System.out.println(Arrays.toString(nums1));
	}

}
