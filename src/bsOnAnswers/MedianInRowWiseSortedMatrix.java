package bsOnAnswers;

public class MedianInRowWiseSortedMatrix {
	static int median(int[][] ar){
	      int m=ar[0].length;   //row length
	      int n=ar.length;     //col length
	      int min=Integer.MAX_VALUE;
	      int max=Integer.MIN_VALUE;
	      for(int i=0;i<n;i++){
	        if(ar[i][0]<min){
	          min=ar[i][0];
	        }
	        if(ar[i][m-1]>max){
	          max=ar[i][m-1];
	        }
	      }
	      
	      int desiredPos=(m*n+1)/2;
	      while(min<max){
	        int mid=min+(max-min)/2;
	        int place=0;
	        for(int i=0;i<n;i++){
	          place+=upperBound(ar[i],mid);
	        }
	        if(place<desiredPos){
	          min=mid+1;
	        }
	        else{
	          max=mid;
	        }
	      }
	      return min;
	    }
	    
	    static int upperBound(int[] row,int num){
	      int l=0,h=row.length;
	      while(l<h){
	        int m=l+(h-l)/2;
	        if(row[m]<=num){
	          l=m+1;
	        }
	        else{
	          h=m;
	        }
	      }
	      return l;
	    }
	    
	    public static void main(String[] args) {
	      int[][] ar={{1,3,5},{2,6,9},{3,6,9}};
	      System.out.println(median(ar));
	    }

}
