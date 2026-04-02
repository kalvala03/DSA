package arrays;
import java.util.*;

public class IsAr2SubsetofAr1 {
	
//Works only if elements are distinct
  static boolean method(int[] a,int[] b){
    Set<Integer> s=new TreeSet<>();
    for(int i=0;i<a.length;i++){
      s.add(a[i]);
    }
    for(int i=0;i<b.length;i++){
      if(!s.contains(b[i])){
        return false;
      }
    }
    return true;
  }
  
//Works even if elements are not distinct
  static boolean method1(int[] a,int[] b){
      Map<Integer,Integer> m=new HashMap<>();
      for(int i=0;i<a.length;i++){
        m.put(a[i],m.getOrDefault(a[i],0)+1);
      }
      for(int i=0;i<b.length;i++){
        if(!m.containsKey(b[i]) || m.get(b[i])==0){
          return false;
        }
        m.put(b[i],m.get(b[i])-1);
      }
      return true;
    }
        
    public static void main(String[] args) {
      //int[] a={11,1,13,21,3,7}; 
      //int[] b={11,3,7,1}; 
      //System.out.println(method(a,b));
      
      int[] a={11,7,1,13,21,3,7,3};
      int[] b={11,3,7,1,7};
      System.out.println(method1(a,b));
    }
}
