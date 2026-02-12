package binarysearchOn1D;

public class CountOccurrencesInSortedAr {

    // Binary search to find first/last occurrence
    public static int search(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;

                if (findFirst) {
                    end = mid - 1;     // search left
                } else {
                    start = mid + 1;   // search right
                }
            }
        }
        return ans;
    }

    // Function to count occurrences
    public static int countOccurrences(int[] nums, int target) {

        int first = search(nums, target, true);

        if (first == -1) {
            return 0;   // target not present
        }

        int last = search(nums, target, false);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;

        int count = countOccurrences(nums, target);
        System.out.println(count);
    }
}
