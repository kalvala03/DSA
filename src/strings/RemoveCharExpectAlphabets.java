package strings;

public class RemoveCharExpectAlphabets {
	static String method(String s) {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				res.append(ch);
			}
			else {
				continue;
			}
		}
		return res.toString();
	}
	public static void main(String[] args) {
		String s="Take3# 8u forward";
		System.out.print(method(s));
	}

}
