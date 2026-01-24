package slow_fast_pointer;

//TC:O(n),Sc:O(1);
public class FindDuplicate {
	static int method(int[] ar) {
		int sp=ar[0],fp=ar[0];  //sp=slowPointer,fp=fastPointer
		do {
			sp=ar[sp]; //+1
			fp=ar[ar[fp]]; //+2
		}while(sp!=fp);
		
		sp=ar[0];
		while(sp!=fp) {
			sp=ar[sp];
			fp=ar[fp];
		}
		return sp;  //can also return fp
	}

	public static void main(String[] args) {
		int[] ar= {3,1,3,4,2};
		System.out.println(method(ar));
	}

}
