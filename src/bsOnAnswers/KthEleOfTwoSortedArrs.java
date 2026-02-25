package bsOnAnswers;

public class KthEleOfTwoSortedArrs {

	static int method(int[] ar1,int[] ar2,int k) {
		if(ar2.length<ar1.length) {
			return method(ar2,ar1,k);
		}
		int l=Math.max(k-ar2.length,0),h=Math.min(k, ar1.length);
		int left=k;
		while(l<=h) {
			int m1=l+(h-l)/2;
			int m2=left-m1;
			int l1 = Integer.MIN_VALUE;
			int l2 = Integer.MIN_VALUE;
			int r1 = Integer.MAX_VALUE;
			int r2 = Integer.MAX_VALUE;

			if (m1 > 0) {
			    l1 = ar1[m1 - 1];
			}
			if (m1 < ar1.length) {
			    r1 = ar1[m1];
			}
			if (m2 > 0) {
			    l2 = ar2[m2 - 1];
			}
			if (m2 < ar2.length) {
			    r2 = ar2[m2];
			}
			if(l1<=r2 && l2<=r1) {
				return Math.max(l1,l2);
			}
			else if(l2>r1) {
				l=m1+1;
			}
			else {
				h=m1-1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] ar1= {2,3,6,7,9};
		int[] ar2= {1,4,8,10};
		int k=5;
		System.out.println(method(ar1,ar2,k));
	}
}
