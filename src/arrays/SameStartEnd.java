package arrays;

public class SameStartEnd {

	static void method(int[] ar) {
		for(int num:ar) {
			int lastDigit=num%10;
			int firstDigit=num;
			while(firstDigit>=10) {
				firstDigit=firstDigit/10;
			}
			if(firstDigit==lastDigit) {
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args) {
		int[] ar= {76,9889,6776,456,3443};
		method(ar);
	}

}
