package strings;

public class MaxOcuuringChar {
	static char method(String s) {
		int[] freq=new int[256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			freq[ch]++;
		}
		int maxFreq=0;
		char maxChar='\0';
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(freq[ch]>maxFreq) {
				maxFreq=freq[ch];
				maxChar=ch;
			}
		}
		return maxChar;
	}
	public static void main(String[] args) {
		String s="takeuforward";
		System.out.print(method(s));
	}
}
