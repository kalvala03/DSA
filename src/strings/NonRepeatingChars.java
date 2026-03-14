package strings;

public class NonRepeatingChars {
    static void method(String s) {
        int[] freq=new int[26];

        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch==' ') {
                continue;
            }else {
                freq[ch-'a']++;
            }
        }

        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch!=' ' && freq[ch-'a']==1) {
                System.out.print(ch+" ");
            }
        }
    }

    public static void main(String[] args) {
        String s="blockchain technology";
        method(s);
    }
}