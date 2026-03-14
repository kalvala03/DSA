package arrays;

public class MaxProdSubar {
	static int method(int[] ar) {
		int maxProd=Integer.MIN_VALUE;
		int preProd=1;
		int sufProd=1;
		for(int i=0;i<ar.length;i++) {
			if(preProd==0) {
				preProd=1;
			}
			if(sufProd==0) {
				sufProd=1;
			}
			preProd*=ar[i];
			sufProd*=ar[ar.length-i-1];
			maxProd=Math.max(maxProd, Math.max(preProd, sufProd));
		}
		return maxProd;
	}

	public static void main(String[] args) {
		int[] ar= {1,2,-3,0,-4,-5};
		System.out.println(method(ar));
	}
}
