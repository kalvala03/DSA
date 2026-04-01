package com.arraysCyclicsort;

import java.util.*;

//Find All Duplicates in an Array(concept used- cyclic sort bcz in problem statement range given [0,n])
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicates {
	static int[] method(int[] ar){
        int i=0;
        while(i<ar.length){
            int curIdx=ar[i]-1;
            if(ar[i]!=ar[curIdx]){
                int t=ar[i];
                ar[i]=ar[curIdx];
                ar[curIdx]=t;
            }else{
                i++;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<ar.length;j++){
            if(ar[j]!=j+1){
                ans.add(ar[j]);
            }
        }
        
        int[] res=new int[ans.size()];
        for(int j=0;j<ans.size();j++){
            res[j]=ans.get(j);
        }
        return res;
	}

	public static void main(String[] args) {
		int[] ar = {4, 3, 2, 7, 8, 2, 3, 1};
		System.out.println(Arrays.toString(method(ar)));
	}

}
