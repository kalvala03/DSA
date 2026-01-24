package strings;

//125. Valid Palindrome-->https://leetcode.com/problems/valid-palindrome
//Tc:O(n),Sc:O(1)
public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
        int l=0,h=s.length()-1;
        while(l<h){
            if(!isAlphanum(s.charAt(l))){
                l++;
                continue;
            }
            if(!isAlphanum(s.charAt(h))){
                h--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(h))){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    public static boolean isAlphanum(char ch){
        if(ch>='0' && ch<='9' || Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z'){
            return true;
        }
        return false;
    }

	public static void main(String[] args) {
		String s= "A man, a plan, a canal: Panama";
		//String s="race a car";
		System.out.println(isPalindrome(s));

	}

}
