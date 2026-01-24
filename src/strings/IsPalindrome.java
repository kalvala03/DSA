package strings;

public class IsPalindrome {
	public static boolean method(String s) {
		int p=0,q=s.length()-1;
		while(p<q) {
			if(s.charAt(p)!=s.charAt(q)) {
				return false;
			}
			p++;
			q--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s="madam";
		System.out.println(method(s));

	}

}
