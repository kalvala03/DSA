package strings;

public class CountNoOfWords {
	static int method(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ' &&(i==0||s.charAt(i-1)==' ')) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s="hello hello world";
		System.out.print(method(s));
	}
}
