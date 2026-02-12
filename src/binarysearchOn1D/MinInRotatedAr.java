package binarysearchOn1D;

public class MinInRotatedAr {
	//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
	public static int method(int[] ar) {
        int l = 0, h = ar.length - 1;
        int ans = Integer.MAX_VALUE;
        while (l <= h) {
            // If already sorted
            if (ar[l] <= ar[h]) {
                ans = Math.min(ans, ar[l]);
                break;
            }
            int m = l + (h - l) / 2;
            // Left half sorted
            if (ar[l] <= ar[m]) {
                ans = Math.min(ans, ar[l]);
                l = m + 1;
            }
            else { // Right half sorted
                ans = Math.min(ans, ar[m]);
                h = m - 1;
            }
        }
        return ans;
    }
	
	//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
	public int methoddup(int[] ar) {
        int l = 0, h = ar.length - 1;
        int ans = Integer.MAX_VALUE;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (ar[l] == ar[m] && ar[m] == ar[h]) {
                ans = Math.min(ans, ar[l]);
                l++;
                h--;
                continue;
            }
            if (ar[l] <= ar[m]) {
                ans = Math.min(ans, ar[l]);
                l = m + 1;
            }
            else {  
                ans = Math.min(ans, ar[m]);
                h = m - 1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int[] ar= {4,5,6,7,0,1,2,3};
		System.out.println(method(ar));
	}

}
