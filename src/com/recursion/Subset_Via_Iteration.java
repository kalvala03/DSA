package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//No recursion involved
//Timecomplexity-->O(N* 2^N) where N=no of subsets
//Space Complexity-->O(2^N * N)

public class Subset_Via_Iteration {
	
	//array doesnot contains duplicates
	static List<List<Integer>> subset(int[] ar){
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int num:ar) {
			int n=outer.size();
			for(int i=0;i<n;i++) {
				List<Integer> internal=new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		return outer;
	}
	
	//array contains duplicates
	static List<List<Integer>> subsetDuplicate(int[] ar1){
		Arrays.sort(ar1);
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		int start=0;
		int end=0;
		for(int i=0;i<ar1.length;i++) {
			start=0;
			if(i>0 && ar1[i]==ar1[i-1]) {
				start=end+1;
			}
			end=outer.size()-1;
			int n=outer.size();
			for(int j=start;j<n;j++) {
				List<Integer> internal=new ArrayList<>(outer.get(j));
				internal.add(ar1[i]);
				outer.add(internal);
			}
		}
		return outer;
	}

	public static void main(String[] args) {
		int[] ar= {1,2,3};
		int[] ar1= {1,2,2};
		System.out.println(subset(ar));
		System.out.println(subsetDuplicate(ar1));
		
		/*
		List<List<Integer>> ans=subset(ar);
		for(List<Integer> list:ans) {
			System.out.println(list);
		}
		*/

	}

}
