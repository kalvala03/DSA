package binarysearchOn1D;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
//81. Search in Rotated Sorted Array II

public class SearchInRotatedSortedArrayII {

    public static boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // CASE 1: target found at mid
            // Example: nums = [2,5,6,0,0,1,2], target = 0
            // low=0, mid=3, high=6 → nums[mid]=0 → FOUND
            if (nums[mid] == target) {
                return true;
            }

            // CASE 2: left half is strictly sorted
            // Example: nums = [4,5,6,7,0,1,2]
            // low=0(4), mid=3(7), high=6
            if (nums[low] < nums[mid]) {

                // Target lies inside left sorted half
                // Example:
                // target = 5 → between nums[low]=4 and nums[mid]=7
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } 
                // Target lies in right half
                // Example:
                // target = 1 → not in [4,7)
                else {
                    low = mid + 1;
                }
            }

            // CASE 3: right half is strictly sorted
            // Example: nums = [6,7,0,1,2,4,5]
            // low=0, mid=3(1), high=6(5)
            else if (nums[mid] < nums[high]) {

                // Target lies inside right sorted half
                // Example:
                // target = 4 → between nums[mid]=1 and nums[high]=5
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } 
                // Target lies in left half
                // Example:
                // target = 7 → not in (1,5]
                else {
                    high = mid - 1;
                }
            }

            // CASE 4: duplicates — cannot determine sorted half
            // Condition:
            // nums[low] == nums[mid] == nums[high]
            // Example: nums = [2,2,2,2,2,2,2]
            // low=0, mid=3, high=6 → all are equal
            // We safely shrink the search space
            else {
                low++;
                high--;
            }
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 2;

        System.out.println(search(nums, target)); 
    }
}


