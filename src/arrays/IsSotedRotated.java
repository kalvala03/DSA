package arrays;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated

public class IsSotedRotated {
	public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		//int[] nums= {3,4,5,1,2};  //rotated 2 times
		//int[] nums= {1,2,3};   rotated 0 times
		int[] nums= {2,1,3,4};
		System.out.println(check(nums));		

	}

}
