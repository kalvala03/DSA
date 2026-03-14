package strings;

public class CapitalizeFirstLastChar {
	static String method(String s) {
		char[] ar=s.toCharArray();
		ar[0]=Character.toUpperCase(ar[0]);
		for(int i=1;i<ar.length-1;i++) {
			if(ar[i]==' ') {
				ar[i-1]=Character.toUpperCase(ar[i-1]);
				ar[i+1]=Character.toUpperCase(ar[i+1]);
			}
		}
		ar[ar.length-1]=Character.toUpperCase(ar[ar.length-1]);
		return new String(ar);
	}
	public static void main(String[] args) {
		String s="take u forward";
		System.out.print(method(s));
	}
}
