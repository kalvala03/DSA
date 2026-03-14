package strings;

public class CalculateFreqOfChars {

	static void method(String s) {
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			freq[ch-'a']++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				System.out.print((char)(i+'a')+""+freq[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		String s="takeuforward";
		method(s);
	}
}
/*
//Print all duplicates with its freq

public class CalculateFreqOfChars {

	static void method(String s) {
		int[] freq=new int[256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			freq[ch]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				System.out.print((char)(i)+""+freq[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		String s="takeuforward";
		method(s);
	}
}
*/
