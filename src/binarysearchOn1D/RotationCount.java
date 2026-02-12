package binarysearchOn1D;

public class RotationCount {

    public static int countRotations(int[] ar) {
        int peak = findPeak(ar);
        return peak + 1;
    }
    public static int findPeak(int[] ar) {
        int s = 0;
        int e = ar.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            // Case 1: middle element > next → m is peak
            if (m < e && ar[m] > ar[m + 1]) {
                return m;
            }

            // Case 2: middle element < previous → previous is peak
            if (m > s && ar[m] < ar[m - 1]) {
                return m - 1;
            }

            // Case 3: decide which side to go
            if (ar[m] >= ar[s]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1; // means array not rotated
    }
    public static void main(String[] args) {
        int[] ar = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotations(ar)); 
    }
}
