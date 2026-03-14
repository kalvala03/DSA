package strings;

public class RemoveBracketsFrmAlgebraicExp {
	static String method(String s) {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='('||ch==')') {
				continue;
			}
			res.append(ch);
		}
		return res.toString();
	}
	public static void main(String[] args) {
		String s="a+((b-c))+d)";
		System.out.print(method(s));

	}

}
