package strings;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-string--->Tc:O(n),Sc:O(1)
public class ReverseString {
	
	public static void method(char[] s) {
        int p=0,q=s.length-1;
        while(p<q){
            char t=s[p];
            s[p]=s[q];
            s[q]=t;
            p++;q--;
        }       
    }
	public static void main(String[] args) {
		char[] s= {'h','e','l','l','o'};
		method(s);
		System.out.println(Arrays.toString(s));
	}
}
