package bsOnAnswers;

public class SquareRoot {

	//BruteForce-TC:O(n)
	static int method(int n) {
		int ans=0;
		for(int i=1;i<=n;i++) {
			if((long)(i)*i<=n) { //If i*i is computed using int, it may exceed the int range for large values and give incorrect results. 
				ans=i;
			}else {
				break;
			}
		}
		return ans;
	}
	//optimized-TC:O(log n)
	static int method1(int n) {
		int s=0,e=n;
		int ans=0;
		while(s<=e) {
			int m=s+(e-s)/2;
			if((long)m*m<=n) {  
				ans=(int)m;
				s=(int)m+1;
			}else {
				e=(int)m-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int n=36;
		System.out.println(method1(n));
	}

}
