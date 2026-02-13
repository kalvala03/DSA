package bsOnAnswers;

public class NthRoot {
	static int method1(int x,int n) {
		int s=0,e=x;
		int ans=0;
		while(s<=e) {
			int m=s+(e-s)/2;
			if(Math.pow(m,n)<=x) {  
				ans=(int)m;
				s=(int)m+1;
			}else {
				e=(int)m-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int x=27;
		int n=3; //as n=3,we need cube root
		System.out.println(method1(x,n));

	}

}
