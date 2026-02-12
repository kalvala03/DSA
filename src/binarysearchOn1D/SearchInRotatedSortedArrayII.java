package binarysearchOn1D;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
//81. Search in Rotated Sorted Array II

public class SearchInRotatedSortedArrayII {

	 public static boolean search(int[] arr, int k) {
	        int low = 0, high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;	            
	            if (arr[mid] == k) return true;

	            // Handle duplicates: cannot determine sorted side
	            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
	                low++;
	                high--;
	                continue;
	            }

	            // Left half is sorted
	            if (arr[low] <= arr[mid]) {
	                if (arr[low] <= k && k <= arr[mid]) {
	                    high = mid - 1; // Search left
	                } else {
	                    low = mid + 1;  // Search right
	                }
	            }
	            // Right half is sorted
	            else {
	                if (arr[mid] <= k && k <= arr[high]) {
	                    low = mid + 1;  // Search right
	                } else {
	                    high = mid - 1; // Search left
	                }
	            }
	        }

	        return false; // Not found
	    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 2;

        System.out.println(search(nums, target)); 
    }
}


