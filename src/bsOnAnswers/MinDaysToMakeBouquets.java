package bsOnAnswers;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets
public class MinDaysToMakeBouquets {
	//Bruteforce-->TC:O((max-min)*n)
	static int method(int[] ar,int m,int k) {
		if(ar.length < m*k) 
			return -1; 
		int min=Arrays.stream(ar).min().getAsInt();
		int max=Arrays.stream(ar).max().getAsInt();
		for(int day=min;day<=max;day++) {
			if(possible(ar,day,m,k)) {
				return day;
			}
		}
		return -1;
	}
	//Optimized-->TC:O(Nlog(Max−Min))
	static int method1(int[] ar,int m,int k) {
		if(ar.length < m*k) 
			return -1; 
		int min=Arrays.stream(ar).min().getAsInt();
		int max=Arrays.stream(ar).max().getAsInt();
		int s=min,e=max;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(possible(ar,mid,m,k)) {
				e=mid-1;
			}else {
				s=mid+1;
			}
		}
		return s;
	}
	static boolean possible(int[] ar,int day,int m,int k) {
		int c=0,bouq=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<=day) {
				c++;
			}else {
				bouq+=c/k;
				c=0;
			}
		}
		bouq+=c/k;
		if(bouq>=m) {
			return true;
		}else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		int[] ar= {7,7,7,7,13,11,12,7};
		int m=2,k=3;
		System.out.println(method1(ar,m,k));
	}

}
