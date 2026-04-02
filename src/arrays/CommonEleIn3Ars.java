package arrays;

import java.util.*;

public class CommonEleIn3Ars {
    static int[] method(int[] a,int[] b,int[] c){
      Set<Integer> s1=new TreeSet<>();
      Set<Integer> s2=new TreeSet<>();
      for(int i=0;i<a.length;i++){
        s1.add(a[i]);
      }
      for(int i=0;i<b.length;i++){
        s2.add(b[i]);
      }
      List<Integer> l=new ArrayList<>();
      for(int i=0;i<c.length;i++){
        if(s1.contains(c[i]) && s2.contains(c[i])){
          l.add(c[i]);
          s1.remove(c[i]);
          s2.remove(c[i]);
        }
      }
      int[] res=new int[l.size()];
      for(int i=0;i<l.size();i++){
        res[i]=l.get(i);
      }
      return res;
    }
    public static void main(String[] args) {
      int[] a={1,5,10,20,40,80};
      int[] b={6,7,20,80,100};
      int[] c={3,4,15,20,30,70,80,120};
      System.out.println(Arrays.toString(method(a,b,c)));
    }
}