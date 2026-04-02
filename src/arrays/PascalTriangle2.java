package arrays;

import java.util.*;
public class PascalTriangle2 {
	
	//Specif ele
	static int getEle(int r,int c) {
		int res=1;
		for(int i=0;i<c;i++) {
			res=res*(r-i);
			res=res/(i+1);
		}
		return res;
	}

	//Specific row (not 0-based indexing)
	static List<Integer> getRow(int r) {
		 long ans=1;
	      List<Integer> temp=new ArrayList<>();
	      temp.add((int)ans);
	      for(int c=1;c<r;c++){
	        ans=ans*(r-c);
	        ans=ans/(c);
	        temp.add((int)ans);
	      }
	      return temp;
	 }
	
	//Specif row (0-based indexing)
	static List<Integer> getRow_0BasedIndexing(int r) {
		 long ans=1;
	      List<Integer> temp=new ArrayList<>();
	      temp.add((int)ans);
	      for(int c=1;c<=r;c++){
	        ans=ans*(r-c+1);
	        ans=ans/(c);
	        temp.add((int)ans);
	      }
	      return temp;
	 }
	
	
	
	public static void main(String[] args) {
		
		System.out.println(getRow(4));
		System.out.println(getRow_0BasedIndexing(4));
		
		int r=5;
		int c=3;
		System.out.println(getEle(r-1,c-1));		
	}
}
