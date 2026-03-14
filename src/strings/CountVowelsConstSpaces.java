package strings;

public class CountVowelsConstSpaces {
	static void method(String s) {
		s=s.toLowerCase();
		int vowels=0,constants=0,spaces=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else if(ch>='a'&&ch<='z') {
				constants++;
			}
			else if(ch==' ') {
				spaces++;
			}
		}
		System.out.println("vowels:"+vowels);
		System.out.println("Constants:"+constants);
		System.out.println("spaces:"+spaces);
	}

	public static void main(String[] args) {
		String s="take u forward is Awesome";
		method(s);
	}
}
