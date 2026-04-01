package strings;

public class NextLexicographicAlphabet {
	static String method(String s) {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='z') {
				res.append('a');
			}
			else if(ch=='Z') {
				res.append('A');
			}
			else {
				res.append((char)(ch+1));
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {
		String s="abcdxyz";
		System.out.print(method(s));
	}
}
