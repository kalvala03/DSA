package binarysearchOn1D;

public class PosInInfiniteArray {
	public static int final_ans(int[] ar,int key) {
		int low=0;
		int high=1;
		
		while(key>ar[high]) {
			int temp=high+1;   //here new start is kept in temp 
			high=high+(high-low+1)*2;   //end=prev end+size of chunck*2
			low=temp;
		}
		return Binsearch(ar,key,low,high) ;
	}

	public static int Binsearch(int[] ar,int key,int low,int high) {		
		while(low<=high) {
			//int mid=low+high/2;  this formula might exceeds the range of integer
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
		return -1;

	}
	public static void main(String[] args) {
		int[] ar= {1,3,7,9,12,13,16,19,21,24,35,56,77,88,98};    //assume it as infinite array
		int key=35;
		System.out.println(final_ans(ar,key));
	}

}
