package strings;

public class RemoveSpacesFrmStr {
	static String method(String s) {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				continue;
			}
			res.append(ch);
		}
		return res.toString();
	}

	public static void main(String[] args) {
		String s="Take u forward";
		System.out.print(method(s));
	}
}
