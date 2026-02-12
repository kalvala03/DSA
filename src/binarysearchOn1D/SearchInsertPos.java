package binarysearchOn1D;

public class SearchInsertPos {

	static int method(int[]ar,int x) {
		int ans=ar.length;  //default
		int l=0,h=ar.length;
		while(l<=h) {
			int m=l+(h-l)/2;
			if(ar[m]>=x) {
				ans=m;
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] ar= {1,2,4,7};
		int x=6;
		System.out.println(method(ar,x));
	}

}
