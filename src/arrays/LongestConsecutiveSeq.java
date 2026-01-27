package arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {
	// Better --> TC: O(n log n)
	static int method(int[] ar) {
		if (ar.length == 0) return 0;
		Arrays.sort(ar);
		int c = 1,max = 1;
		for (int i = 0; i < ar.length - 1; i++) {
			// Ignore duplicates
			if (ar[i] == ar[i + 1]) {
				continue;
			}
			// Consecutive
			if (ar[i] + 1 == ar[i + 1]) {
				c++;
			}
			else {
				c = 1;  //Break in sequence,reset count
			}
			max = Math.max(max, c);
		}
		return max;
	}
	static int method1(int[] ar1) {
		int longest=0;
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<ar1.length;i++) {
			s.add(ar1[i]);
		}
		for(int num:ar1) {
			if(!s.contains(num-1)) {
				int c=1;
				int x=num;
				while(s.contains(x+1)) {
					x++;
					c++;
				}
				longest=Math.max(longest,c);
			}
		}
		return longest;
	}
	public static void main(String[] args) {
		//int[] ar = {0,3,7,2,5,8,4,6,0,1};
		int[] ar = {1, 2, 2, 4, 5, 6, 7};
		int[] ar1= {10,5,6,1,2,7,11};
		System.out.println(method(ar)); 
		System.out.println(method1(ar1));
	}
}
