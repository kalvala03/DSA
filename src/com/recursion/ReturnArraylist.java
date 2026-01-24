package com.recursion;

import java.util.ArrayList;

public class ReturnArraylist {

	static ArrayList<Integer> fun(int[] ar,int key,int index,ArrayList<Integer> list){
		if(index==ar.length) {
			return list;
		}
		if(ar[index]==key) {
			list.add(index);
		}
		return fun(ar,key,index+1,list);
	}
	public static void main(String[] args) {
		int[] ar= {2,3,3,4,5};
		System.out.println(fun(ar,3,0,new ArrayList<>()));
	}

}
