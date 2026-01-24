package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarWithSumK_PosNeg {

    // Finds the longest subarray whose sum is equal to k
    public static int method(int[] ar, int k) {

        // Stores prefix sum and its first index
        Map<Integer, Integer> preSumMap = new HashMap<>();

        int sum = 0;      // current total sum
        int maxLen = 0;   // longest length found

        for (int i = 0; i < ar.length; i++) {

            // Add current element to sum
            sum += ar[i];

            // If sum itself is k, subarray starts from index 0
            if (sum == k) {
                maxLen = i + 1;
            }

            // Find remaining value needed
            int rem = sum - k;

            // If remaining sum was seen before,
            // subarray between those indexes gives sum k
            if (preSumMap.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - preSumMap.get(rem));
            }

            // Store sum only once (first time)
            // helps to get longest subarray
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] ar = {-1, 1, 1};
        int k = 1;

        System.out.println(method(ar, k));
    }
}
