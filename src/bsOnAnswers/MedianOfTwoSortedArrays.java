package bsOnAnswers;

//https://leetcode.com/problems/median-of-two-sorted-arrays
public class MedianOfTwoSortedArrays {
	//BruteForce--Tc:O(m+n),Sc:O(m+n)
	static float method(int[] ar1,int[] ar2) {
		int[] temp=new int[ar1.length+ar2.length];
		int i=0,j=0;
		int k=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				temp[k]=ar1[i];
				k++;i++;
			}else {
				temp[k]=ar2[j];
				k++;j++;
			}
		}
		while(i<ar1.length) {
			temp[k]=ar1[i];
			k++;i++;
		}
		while(j<ar2.length) {
			temp[k]=ar2[j];
			k++;j++;
		}
		if(temp.length%2==0) {
			int mid=temp.length/2;
			return (float)(temp[mid]+temp[mid-1])/2;
		}else {
			int mid=temp.length/2;
			return temp[mid];
		}
	}
	
	//Optimal--TC:O(log(m+n)),SC:O(1)
	static float method1(int[] ar1,int[] ar2) {
		if(ar2.length<ar1.length) {
			return method1(ar2,ar1);
		}
		int l=0,h=ar1.length;
		while(l<=h) {
			int m1=l+(h-l)/2;
			int m2=((ar1.length+ar2.length+1)/2)-m1;
			int l1,l2,r1,r2;
			if(m1==0)
				l1=Integer.MIN_VALUE;
			else
				l1=ar1[m1-1];
			if(m1==ar1.length)
				r1=Integer.MAX_VALUE;
			else
				r1=ar1[m1];
			if(m2==0)
				l2=Integer.MIN_VALUE;
			else
				l2=ar2[m2-1];
			if(m2==ar2.length)
				r2=Integer.MAX_VALUE;
			else
				r2=ar2[m2];
			if(l1<=r2 && l2<=r1) {
				if((ar1.length+ar2.length)%2==0) {
					return (float)(Math.max(l1,l2)+Math.min(r1,r2))/2;
				}else {
					return Math.max(l1,l2);
				}
			}
			else if(l2>r1) {
				l=m1+1;
			}
			else {
				h=m1-1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] ar1= {1,3,8,17};
		int[] ar2= {5,6,7,19,21,25};
		System.out.println(method1(ar1,ar2));
	}

}
