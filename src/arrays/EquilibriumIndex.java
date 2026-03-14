package arrays;

public class EquilibriumIndex {
	//Bruteforce:Tc-O(n^2)
	static int method(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			int leftsum=0,rightsum=0;
			for(int j=0;j<i;j++) {
				leftsum+=ar[j];
			}
			for(int j=i+1;j<ar.length;j++) {
				rightsum+=ar[j];
			}
			if(leftsum==rightsum) {
				return i;
			}
		}
		return -1;
	}
	//Optimal-O(n)
	static int method1(int[] ar) {
		int totalsum=0;
		for(int i=0;i<ar.length;i++) {
			totalsum+=ar[i];
		}
		int ls=0,rs=totalsum;
		for(int i=0;i<ar.length;i++) {
			rs-=ar[i];
			if(ls==rs) {
				return i;
			}
			ls+=ar[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] ar= {2,3,-1,8,4};
		System.out.println(method1(ar));
	}
}
