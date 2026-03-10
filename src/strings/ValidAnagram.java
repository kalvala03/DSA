package strings;

public class ValidAnagram {

	static boolean method(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		String s="cat";
		String t="act";
		System.out.println(method(s,t));
	}
}
