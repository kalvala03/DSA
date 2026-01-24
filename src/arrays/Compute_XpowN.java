package arrays;

//https://leetcode.com/problems/powx-n
//50. Pow(x, n)

public class Compute_XpowN {
	
	//brute force-->Tc:O(n)
	public static double comp(double x,int n) {
		double ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*x;
		}
		return ans;
	}
	
	//Optimized:Binary Exponentiation-->Tc:O(logn)
	public static double compute(double x,int n) {
		if(n==0) 
			return 1.0;
		if(x==0)
			return 0.0;
		if(x==1)
			return 1.0;
		if(x==-1 && n%2==0)
			return 1.0;
		if(x==-1 && n%2!=0)
			return -1.0;
		
		long bf=n;
		if(n<0) {
			x=1/x;
			bf=-bf;
		}
		double ans=1;
		while(bf>0) {
			if(bf%2==1) {
				ans=ans*x;
			}
			x*=x;
			bf/=2;
		}
		return ans;
	}

	public static void main(String[] args) {
		double x=2.0000;
		int n=10;
		System.out.println(compute(x,n));

	}

}
