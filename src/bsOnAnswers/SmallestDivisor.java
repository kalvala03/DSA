package bsOnAnswers;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold
public class SmallestDivisor {
	public static int method(int[] ar, int limit) {
		int max=Arrays.stream(ar).max().getAsInt();
        int s=1,e=max;
        while(s<=e) {
        	int m=s+(e-s)/2;
        	long total_sum=sum(ar,m);  
        	if(total_sum<=limit) {
        		e=m-1;
        	}else {
        		s=m+1;
        	}
        }
        return s;
    }
	static long sum(int[] ar, int m) {
		long total_sum=0;
		for(int i=0;i<ar.length;i++) {
			total_sum+=(long)Math.ceil((double)ar[i]/m);
		}
		return total_sum;
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5};
		int limit=8;
		System.out.println(method(ar,limit));
	}

}
