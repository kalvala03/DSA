package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Tc:O(n),Sc:O(n)
public class LeadersInAr {
	static List<Integer> method(int[] ar){
		List<Integer> ans=new ArrayList<>();
		int n=ar.length;
		int leader=ar[n-1];
		ans.add(leader);
		for(int i=n-2;i>=0;i--) {
			if(ar[i]>leader) {
				leader=ar[i];
				ans.add(leader);
			}
		}
		Collections.reverse(ans);  // Reverse the list to correct the order of leaders
		return ans;
	}

	public static void main(String[] args) {
		int[] ar= {10,22,12,3,0,6};
		System.out.println(method(ar));

	}

}
