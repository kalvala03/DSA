package dp_greedy;

//https://leetcode.com/problems/maximum-subarray
//53.Maximum SubArray(kadane's algorithm)

public class MaximumSubArray_Kadanes {
	
	//Brute force approach-TC:O(n^2)
	public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        for(int i=0;i<nums.length;i++) {
        	int curSum = 0;
        	for(int j=i;j<nums.length;j++) {
        		curSum+=nums[j];
        		maxSum=Math.max(maxSum, curSum);
        	}
        }
        return maxSum;
	}
	
	//Kadane’s Algorithm: keep a running sum, reset it when it becomes negative, and track the maximum subarray sum.
	//Tc:O(n),SC:O(1)
	public static int maxSubArray1(int[] nums) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE; // smallest possible int(-infinity)

        for (int val : nums) {
            curSum += val;                      // add current element
            maxSum = Math.max(maxSum, curSum); // update max
            if (curSum < 0) {
                curSum = 0;    // reset if sum becomes negative
            }
        }
        return maxSum;
    }
	
	public static void main(String[] args) {
		int[] nums= {5,4,-1,7,8};
		//int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray1(nums));
	}
}
