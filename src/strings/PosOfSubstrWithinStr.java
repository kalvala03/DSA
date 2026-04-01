package strings;

public class PosOfSubstrWithinStr {

	static int method(String text,String pattern) {
		int t=text.length();
		int p=pattern.length();
		for(int i=0;i<=t-p;i++) {
			int j=0;
			while(j<p && text.charAt(i+j)==pattern.charAt(j)) {
				j++;
			}
			if(j==p) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String text="takeuforward";
		String pattern="forward";
		System.out.print(method(text,pattern));
	}
}
