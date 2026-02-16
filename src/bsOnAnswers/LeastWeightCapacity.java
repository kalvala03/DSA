package bsOnAnswers;

import java.util.Arrays;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days
public class LeastWeightCapacity {
	//Bruteforce
	static int method(int[] ar,int D) {
		int maxEle=Arrays.stream(ar).max().getAsInt();  
		int arSum=Arrays.stream(ar).sum();
		for(int cap=maxEle;cap<=arSum;cap++) {  
			if(daysReq(ar,cap)<=D) {
				return cap;
			}
		}
		return -1;
	}
	//Optimized
	static int method1(int[] ar,int D) {
		int s=Arrays.stream(ar).max().getAsInt(); 
		int e=Arrays.stream(ar).sum();
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(daysReq(ar,mid)<=D) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return s;
	}
	
	static int daysReq(int[] ar,int cap) {
		int sum=0,days=1;
		for(int i=0;i<ar.length;i++) {
			if(sum+ar[i]>cap) {
				days++;
				sum=ar[i];			
			}
			else {
				sum+=ar[i];
			}
		}
		return days;		
	}

	public static void main(String[] args) {
		int[] ar= {5,4,5,2,3,4,5,6};
		int D=5;
		System.out.println(method1(ar,D));
	}

}
