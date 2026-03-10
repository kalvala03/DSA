package arrays;

public class FreqOfEleInAr {
	static void method(int[] ar) {
		int c=1;
		for(int i=1;i<ar.length;i++) {
			if(ar[i]==ar[i-1]) {
				c++;
			}
			else {
				System.out.println(ar[i-1]+" "+c);
				c=1; //reset
			}
		}
		System.out.println(ar[ar.length-1] + " " + c);
	}

	public static void main(String[] args) {
		int[] ar= {20,20,30,30,30,40};
		method(ar);
	}

}
