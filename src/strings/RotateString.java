package strings;

public class RotateString {
	static boolean method(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String Ds= s+s;
        return Ds.contains(goal);
    }

	public static void main(String[] args) {
		String s="rotation";
		String goal="tionrota";
		System.out.println(method(s,goal));
	}
}
