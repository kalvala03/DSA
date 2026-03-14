package strings;

public class SumOfAllConseqNums {
 
	static int method(String s) {
		int sum=0,num=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				num=num*10+(ch-'0');
			}
			else {
				sum+=num;
				num=0;
			}
		}
		sum+=num;
		return sum;
	}
	public static void main(String[] args) {
		String s="12abc20yz68";
		System.out.print(method(s));
	}
}
