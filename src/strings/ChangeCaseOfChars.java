package strings;

public class ChangeCaseOfChars {

	static String method(String s) {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			else if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
			}
			res.append(ch);
		}
		return res.toString();
	}
	public static void main(String[] args) {
		String s="Java Is A Lang";
		System.out.print(method(s));
	}
}
