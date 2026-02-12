package binarysearchOn1D;

public class Lower_UpperBound {
	//Lower Bound  → include x  (>=)
	//Upper Bound  → exclude x  (>)
	 public static int lowerBound(int[] arr, int x) {
	        int low = 0;                 
	        int high = arr.length - 1;    
	        int ans = arr.length;         

	        while (low <= high) {
	            int mid = (low + high) / 2;  

	            if (arr[mid] >= x) {
	                ans = mid;            
	                high = mid - 1;       
	            } else {
	                low = mid + 1;        
	            }
	        }
	    return ans;  
	}
	 
	 public static int upperBound(int[] arr, int x) {
	        int low = 0, high = arr.length - 1;
	        int ans = arr.length;  // Default to length if not found

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] > x) {
	                ans = mid;        
	                high = mid - 1;   
	            } else {
	                low = mid + 1;    
	            }
	        }
	        return ans;  
	    }

	public static void main(String[] args) {
		 int[] arr = {3, 5, 8, 9, 15, 19}; 
	     int x = 9;
	     System.out.println(lowerBound(arr,x)); 
	     System.out.println(upperBound(arr,x)); 
	}
}
