package binarysearchOn1D;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
//33. Search in Rotated Sorted Array

public class SearchInRotatedArray {
	public static int search(int[] nums,int target) {
		int pivot=findPivot(nums);
		if(pivot==-1) {
			return binSearch(nums,target,0,nums.length-1);
		}
		if(nums[pivot]==target) {
			return pivot;
		}
		if(target>=nums[0]) {
			return binSearch(nums,target,0,pivot-1);
		}
		return binSearch(nums,target,pivot+1,nums.length-1);
	}
	
	public static int findPivot(int[] nums) {
		int s=0;
		int e=nums.length-1;
		while(s<=e) {
			int m=s+(e-s)/2;
			//case1
			if(m<e && nums[m]>nums[m+1]) {   //to ensure it is not out of bound m<e is needed
				return m;
			}
			//case 2
			if(m>s && nums[m]<nums[m-1]) {
				return m-1;		
			}
			
			//case 3 :to decide which side to go 
			if(nums[m]<=nums[s]) {
				e=m-1;
			}else {
				s=m+1;
			}
			
		}
		return -1;
	}
	public static int binSearch(int[] ar,int key,int low,int high) {
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key<ar[mid]) {
				high=mid-1;
			}
			else if(key>ar[mid]) {
				low=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}	

	public static void main(String[] args) {
		int[] nums={4,5,6,7,0,1,2};
		int target=0;
		System.out.println(search(nums,target));
	}

}
