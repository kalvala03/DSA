package bsOnAnswers;

//https://leetcode.com/problems/kth-missing-positive-number
public class KthMissingPositive {
	//BruteForce--TC:O(n)
	static int method(int[] ar,int k) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<=k) {
				k++;
			}else {
				break;
			}
		}
		return k;
	}

	//optimal-->TC:O(LogN)
	static int method1(int[] ar,int k) {
		int l=0,h=ar.length-1;
		while(l<=h) {
			int m=l+(h-l)/2;
			int missing=ar[m]-(m+1);
			if(missing<k) {
				l=m+1;
			}else {
				h=m-1;
			}
		}
		return l+k;
	}
	public static void main(String[] args) {
		int[] ar= {4,7,9,10};
		int k=4;
		System.out.println(method(ar,k));
	}

}
