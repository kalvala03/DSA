package strings;

public class LargestWord {
	static String method(String s) {
		int i=0,j=0;
		int maxLen=0;
		String res="";
		while(j<=s.length()) {
			if(j==s.length() || s.charAt(j)==' ') {
				int curLen=j-i;
				if(curLen>maxLen) {
					maxLen=curLen;
					res=s.substring(i,j);
				}
				i=j+1;
			}
			j++;
		}
		return res;
	}
	public static void main(String[] args) {
		String s="google doc";
		System.out.print(method(s));
	}
}
