package binarysearchOn1D;

//when we don't know whether the array is sorted in ascending or descending order

public class OrderAgnosticBinarySearch {

	public static int binSearch(int[] ar,int key) {
		int low=0;
		int high=ar.length-1;
		
		boolean isAsc= ar[low]<ar[high];
		
		while(low<=high) {
			//int mid=low+high/2;  this formula might exceeds the range of integer
			int mid=low+(high-low)/2;
			
			if(key==ar[mid]) {
				return mid;
			}
			if(isAsc) {
				if(key<ar[mid]) {
					high=mid-1;
				}
				else{
					low=mid+1;
				}
			}
			else {
				if(key<ar[mid]) {
					low=mid+1;
				}
				else{
					high=mid-1;	
				}
			}
			
		}
		return -1;
	}
		
	public static void main(String[] args) {
		//int[] ar= {9,11,23,48,64,88,94};  //ascending
		int[] ar= {99,77,66,55,44,32,11};
		int key=44;
		System.out.println(binSearch(ar,key));
	}

}
