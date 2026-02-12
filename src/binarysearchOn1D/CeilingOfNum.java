package binarysearchOn1D;

//ceiling of number:return index of smallest element that is > or = target element

public class CeilingOfNum {
	public static int binSearch(int[] ar,int key) {
		int low=0;
		int high=ar.length-1;
		
		if(key>ar[ar.length-1]) {
			return -1;
		}
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key<ar[mid]) {
				high=mid-1;
			}
			else if(key>ar[mid]) {
				low=mid+1;
			}
			else {
				return mid;
			}
		}
		return low;   //if while loop breaks and the element is still not found
	}
	public static void main(String[] args) {
		int[] ar= {2,3,5,9,14,16,18};
		int key=17;
		System.out.println(binSearch(ar,key));

	}

}
