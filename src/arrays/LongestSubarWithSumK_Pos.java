package arrays;

//Sliding Window (Two Pointer) approach
public class LongestSubarWithSumK_Pos {
	//BruteForce-->Tc:O(n^3),Sc:O(1)
	public static int method(int[] ar,int k) {
		int maxLen=0;
		for(int s=0;s<ar.length;s++) {
			for(int e=s;e<ar.length;e++) {
				int cur_maxlen=0;
				for(int i=s;i<=e;i++) {
					cur_maxlen+=ar[i];
				}
				if(cur_maxlen==k) {
					maxLen=Math.max(maxLen,e-s+1);
				}
			}
		}
		return maxLen;
	}
	//Better-->Tc:O(n^2),Sc:O(1)
		public static int method1(int[] ar,int k) {
			int maxLen=0;
			//outerloop to select starting index of subar
			for(int i=0;i<ar.length;i++) {
				int cur_maxlen=0;  //reset for each starting index
				//innerloop to extend the subar from starting index
				for(int j=i;j<ar.length;j++) {
					cur_maxlen+=ar[j];
					if(cur_maxlen==k) {
						maxLen=Math.max(maxLen,j-i+1);
					}
				}
			}
			return maxLen;
	}
	//Optimized--->Tc:O(n),Sc:O(1)
	public static int method2(int[] ar,int k) {
		int maxLen=0;
		int p=0,q=0;
		int curSum=ar[0];
		while(q<ar.length) {
			while(p<=q && curSum>k) {
				curSum-=ar[p];
				p++;
			}
			if(curSum==k) {
				maxLen=Math.max(maxLen,q-p+1);
			}
			q++;
			if(q<ar.length) {
				curSum+=ar[q];
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int[] ar= {10,5,2,7,1,9};
		int k=15;
		System.out.println(method1(ar,k));

	}

}
