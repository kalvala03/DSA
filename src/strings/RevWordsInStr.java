package strings;

public class RevWordsInStr {
	static String method(String s) {
		StringBuilder res=new StringBuilder();
		int i=s.length()-1;
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ') {
				i--;
			}
			int end=i;
			while(i>=0 && s.charAt(i)!=' ') {
				i--;
			}
			String word=s.substring(i+1,end+1);
			if(res.length()>0) {
				res.append(" ");
			}
			res.append(word);			
		}
		return res.toString().trim();
	}

	public static void main(String[] args) {
		String s="Hello World ";
		System.out.println(method(s));
	}
}
