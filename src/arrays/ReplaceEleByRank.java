package arrays;

import java.util.*;

public class ReplaceEleByRank {
	static void method(int[] ar) {
		int[] t=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			t[i]=ar[i];
		}
		Arrays.sort(t);
		Map<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<t.length;i++) {
			if(!m.containsKey(t[i])) {
				m.put(t[i], i+1);
			}
		}
		for(int i=0;i<ar.length;i++) {
			ar[i]=m.get(ar[i]);
		}	
	}

	public static void main(String[] args) {
		int[] ar= {20,15,26,2,98,6};
		method(ar);
		System.out.println(Arrays.toString(ar));		
	}
}
