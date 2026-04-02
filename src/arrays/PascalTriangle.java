package arrays;

import java.util.*;

//To generate complete triangle
public class PascalTriangle {
	static List<List<Integer>> method(int n){
	      List<List<Integer>> ans=new ArrayList<>();
	      for(int i=1;i<=n;i++){
	        ans.add(generateRow(i));
	      }
	      return ans;
	    }
	    static List<Integer> generateRow(int r){
	      int ans=1;
	      List<Integer> temp=new ArrayList<>();
	      temp.add(1);
	      for(int c=1;c<r;c++){
	        ans=ans*(r-c);
	        ans=ans/(c);
	        temp.add(ans);
	      }
	      return temp;
	    }
	    public static void main(String[] args) {
	      System.out.println(method(6));	      
	    }
}
