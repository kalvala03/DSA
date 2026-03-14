package strings;

import java.util.Scanner;

public class RemoveVowelsFrmStr {

	static String method(String s) {
		StringBuilder res=new StringBuilder();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				continue;
			}
			res.append(ch);
		}
		return res.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter:");
		String s=sc.nextLine();
		System.out.println(method(s));
		sc.close();
	}
}
