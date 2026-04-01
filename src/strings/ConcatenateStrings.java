package strings;

public class ConcatenateStrings {

	static String method(String s1,String s2) {
		String res="";
		for(int i=0;i<s1.length();i++) {
			res=res+s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++) {
			res=res+s2.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		System.out.print(method(s1,s2));
	}
}
