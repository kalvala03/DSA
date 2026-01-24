package com.arraysCyclicsort;

//Find missing Number in an Array(concept used- cyclic sort bcz in problem statement range given [0,n])
//  https://leetcode.com/problems/missing-number/

public class MissingNum {
    public static int findMissingNumber(int ar[]) {
        int i = 0;
        while (i < ar.length) {
            int correct = ar[i];
            if (ar[i] < ar.length && ar[i] != ar[correct]) {
                int temp = ar[i];
                ar[i] = ar[correct];
                ar[correct] = temp;
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int idx = 0; idx < ar.length; idx++) {
            if (ar[idx] != idx) {
                return idx;
            }
        }
        return ar.length;
    }

    public static void main(String[] args) {
        //case1: 
    	//int ar[] = {3, 0, 1};
    	//case2:
    	int ar[] = {0,2,1};
        int missing = findMissingNumber(ar);
        System.out.println(missing);
    }
}
