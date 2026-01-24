package arrays;

public class SecondLargestSmallest {
	public static int Sec_larg(int[] ar) {
		int max=ar[0],secMax=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				secMax=max;
				max=ar[i];
			}else if (ar[i] > secMax && ar[i] != max) {
	            secMax = ar[i];
	        }
		}
		return secMax;
	}
	public static int Sec_small(int[] ar) {
		int min=ar[0],secMin=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				secMin=min;
				min=ar[i];
			}else if(ar[i]<secMin && ar[i]!=min) {
				secMin=ar[i];
			}
		}
		return secMin;
			
	}

	public static void main(String[] args) {
		int[] ar= {1,2,4,7,7,5};
		System.out.println(Sec_larg(ar));
		System.out.println(Sec_small(ar));
	}

}
