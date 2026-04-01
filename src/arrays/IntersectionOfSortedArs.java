package arrays;

import java.util.*;
public class IntersectionOfSortedArs {
	
	// Approach1-->TC: O(n × m × min(n, m))   SC: O(min(n, m))	
	static List<Integer> method(int[] a,int[] b){
	      List<Integer> ans=new ArrayList<>();
	      for(int i=0;i<a.length;i++){
	        for(int j=0;j<b.length;j++){
	          if(a[i]==b[j]){
	            if(!ans.contains(a[i])){
	              ans.add(a[i]);
	            }
	          }
	        }
	      } 
	      return ans;
	 }
	
	//Approch2->Tc:O(m+n)  Sc:O(n)
	static List<Integer> method1(int[] a,int[] b){
	      Set<Integer> s=new HashSet<>();
	      for(int i=0;i<a.length;i++){
	        s.add(a[i]);
	      }
	      List<Integer> ans =new ArrayList<>();
	      for(int i=0;i<b.length;i++){
	        if(s.contains(b[i])){
	          ans.add(b[i]);
	          s.remove(b[i]);
	        }
	      }
	      return ans;
	  }
	
	 public static void main(String[] args) {
	    int[] a={1,2,1,3,1};
	    int[] b={3,1,3,4,1};
	    System.out.println(method1(a,b));
	 }
}
