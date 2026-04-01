package strings;

public class RemCharsFrm1StrPresntIn2str {
	static String method(String s1,String s2) {
		boolean[] presentAr=new boolean[256];
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			presentAr[ch]=true;
		}
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(!presentAr[ch]) {
				res.append(ch);
			}
		}
		return res.toString();
	}
	public static void main(String[] args) {	
		String s1="abcdef";
		String s2="cefz";
		System.out.print(method(s1,s2));
	}
}
