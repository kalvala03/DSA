package strings;

public class RemoveDuplicates {

	static String method(String s) {
		StringBuilder res=new StringBuilder();
		boolean[] isfound=new boolean[256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!isfound[ch]) {
				res.append(ch);
				isfound[ch]=true;
			}
		}
		return res.toString();
	}
	public static void main(String[] args) {
		String s="cbacdcbc";
		System.out.print(method(s));
	}
}
