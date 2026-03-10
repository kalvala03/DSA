package strings;

public class LargestOddNum {
	static String method(String s) {
		int start=0,end=-1;
		for(int i=s.length()-1;i>=0;i--) {
			if((s.charAt(i)-'0')%2==1) {
				end=i;
				break;
			}
		}
		if(end==-1) {
			return "";
		}
		while(start<=end && s.charAt(start)=='0') {
			start++;
		}
		return s.substring(start,end+1);		
	}

	public static void main(String[] args) {
		String s="0214678";
		System.out.println(method(s));
	}
}
