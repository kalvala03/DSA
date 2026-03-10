package strings;

public class IsIsomorphic {
	static boolean method(String s, String t) {
        int[] m1=new int[256];
        int[] m2=new int[256];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(m1[s.charAt(i)]!=m2[t.charAt(i)]){
                return false;
            }
            m1[s.charAt(i)]=i+1;
            m2[t.charAt(i)]=i+1;
        }
        return true;
    }

	public static void main(String[] args) {
		String s="paper";
		String t="title";
		System.out.println(method(s,t));
	}
}
