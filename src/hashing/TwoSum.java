package hashing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum

public class TwoSum {
	static int[] method(int[] ar,int target) {
		//brute force-->Tc:O(n^2)
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			int first=ar[i];
			for(int j=i+1;j<ar.length;j++) {
				int second=ar[j];
				sum=first+second;
				if(sum==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	static int[] method1(int[] ar,int target) {
		//better--O(n logn)--sorted first then applied two pointer approach
		Arrays.sort(ar);
		int p=0,q=ar.length-1;
		while(p<q) {
			int sum=ar[p]+ar[q];
			if(sum>target) {
				q--;
			}
			else if(sum<target) {
				p++;
			}
			else {
				return new int[] {p,q};
			}
		}
		return new int[] {-1,-1};		
	}
	
	static int[] method2(int[] ar,int target) {
		//optimized approach-->)TC:O(n),SC:O(n)----Hashing
		Map<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            int first=ar[i];
            int sec=target-first;
            if(hp.containsKey(sec)){
                return new int[]{i,hp.get(sec)};
            }
            hp.put(first,i);
        }
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		int[] ar= {5,2,11,7,15};
		System.out.println(Arrays.toString(method2(ar,9)));
	}

}
