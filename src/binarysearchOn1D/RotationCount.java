package binarysearchOn1D;

public class RotationCount {

	public static int method(int[] ar) {

        int l = 0, h = ar.length - 1;
        int ans = Integer.MAX_VALUE;

        while (l <= h) {
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
        return l;
    }
    public static void main(String[] args) {
        int[] ar = {15, 18, 2, 3, 6, 12};
        System.out.println(method(ar)); 
    }
}
