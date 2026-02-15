package bsOnAnswers;

import java.util.Arrays;

//https://leetcode.com/problems/koko-eating-bananas---Tc:O(Nlogm)
public class EatingBannans {

	public static int minEatingSpeed(int[] ar, int h) {
		int max=Arrays.stream(ar).max().getAsInt();
        int s=1,e=max;
        while(s<=e) {
        	int m=s+(e-s)/2;
        	long total_hrs=calTotalHrs(ar,m);  //m=bananas per hour
        	if(total_hrs<=h) {
        		e=m-1;
        	}else {
        		s=m+1;
        	}
        }
        return s;
    }
	static long calTotalHrs(int[] ar, int m) {
		long total_hrs=0;
		for(int i=0;i<ar.length;i++) {
			total_hrs+=(long)Math.ceil((double)ar[i]/m);
		}
		return total_hrs;
	}
	public static void main(String[] args) {
		int[] ar= {3,6,7,11};
		int h=8;
		System.out.println(minEatingSpeed(ar,h));	
	}
}
