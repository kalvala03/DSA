package arrays;

import java.util.*;
public class UnionOf2SortedArs {
	
	//Approach1-->Tc:O((n + m) * (log (n + m)))   sc: O(n + m)
	  static List<Integer> method(int a[],int b[]) {
			Set<Integer> st = new TreeSet<>();
			
			for (int i = 0; i < a.length; i++)
			st.add(a[i]);
			
			for (int i = 0; i < b.length; i++)
			st.add(b[i]);
			
			ArrayList<Integer> res = new ArrayList<>(st);
			return res;
	  }
	  
	  //Aproach2-->Tc:O(n+m)  Sc:O(1)
	  static List<Integer> method1(int a[],int b[]) {
		  ArrayList<Integer> res = new ArrayList<>();
	        int n = a.length;
	        int m = b.length;
	        
	        int i = 0, j = 0;
	        while(i < n && j < m) {
	            
	            // Skip duplicate elements in the first array
	            if(i > 0 && a[i - 1] == a[i]) {
	                i++;
	                continue;
	            }
	            
	            // Skip duplicate elements in the second array
	            if(j > 0 && b[j - 1] == b[j]) {
	                j++;
	                continue;
	            }
	            
	            // select and add the smaller element and move
	            if(a[i] < b[j]) {
	                res.add(a[i]);
	                i++;
	            } 
	            else if(a[i] > b[j]) {
	                res.add(b[j]);
	                j++;
	            } 
	          
	            // If equal, then add to result and move both 
	            else {
	                res.add(a[i]);
	                i++;
	                j++;
	            }
	        }
	        
	        // Add the remaining elements of a[]
	        while (i < n) {
	          
	            // Skip duplicate elements in the first array
	            if(i > 0 && a[i - 1] == a[i]) {
	                i++;
	                continue;
	            }
	            res.add(a[i]);
	            i++;
	        }
	      
	        // Add the remaining elements of b[]
	        while (j < m) {
	          
	            // Skip duplicate elements in the second array
	            if(j > 0 && b[j - 1] == b[j]) {
	                j++;
	                continue;
	            }
	            res.add(b[j]);
	            j++;
	        }
	        return res;
	  }
	  
	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 2, 4 };
        int b[] = { 2, 2, 4, 4 };
        System.out.println(method1(a,b));
	}

}
