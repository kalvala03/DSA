package strings;

public class WordWithHighestRepeatedletters {

	static String method(String s) {
		String res="";
		int maxWord=0;
		int curmaxWord=0;
		for(int l=0;l<s.length();) {
			int r=l+1;
			while(r<s.length() && s.charAt(r)!=' ') {
				r++;
			}
			int[] freq=new int[256];
			curmaxWord=0;  //reset for every word
			for(int i=l;i<r;i++) {
				freq[s.charAt(i)]++;
			}
			for(int i=0;i<freq.length;i++) {
				if(freq[i]>1) {
					curmaxWord++;
				}
			}
			if(curmaxWord>maxWord) {
				maxWord=curmaxWord;
				res=s.substring(l,r);
			}
			l=r+1;
		}
		if(res.isEmpty()) {
			return "-1";
		}
		else {
			return res;
		}
	}
	public static void main(String[] args) {
		String s="Special Character in String";
		System.out.print(method(s));
	}
}
