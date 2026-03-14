package arrays;

public class ChoclateDistribution {
	static void method(int[] ar,int k) {
		int minDiff=Integer.MAX_VALUE;
		for(int i=0;i<=ar.length-k;i++) {
			int max=ar[i];
			int min=ar[i];
			for(int j=i;j<i+k;j++) {
				if(ar[j]>max) {
					max=ar[j];
				}
				if(ar[j]<min) {
					min=ar[j];
				}
			}
			int diff=max-min;
			if(diff<minDiff) {
				minDiff=diff;
			}
		}
		System.out.println(minDiff);
	}

	public static void main(String[] args) {
	int[] ar= {7,3,2,4,9,12,5,6};
	int k=3;
	method(ar,k);
	}

}
