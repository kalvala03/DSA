package binarysearchOn1D;

public class RotationCount {

	public static int method(int[] ar) {

        int l = 0, h = ar.length - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            
            //if array is already sorted
            if (ar[l] <= ar[h]) {
                return l;  
            }           
            // Left half sorted
            if (ar[l] <= ar[m]) {
                l = m + 1;
            }
            // Right half sorted 
            else {               
                h = m;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] ar = {15, 18, 2, 3, 6, 12};
        System.out.println(method(ar)); 
    }
}
