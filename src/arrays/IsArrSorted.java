package arrays;

public class IsArrSorted {

	public static boolean method(int[] ar) {
		int i=0;
		while(i<ar.length-1) {
			if(ar[i]<=ar[i+1]) {
				i++;
			}else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] ar= {1,2,2,3,4,5};
		System.out.println(method(ar));
	}

}
