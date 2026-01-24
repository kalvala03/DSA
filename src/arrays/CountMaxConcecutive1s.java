package arrays;

public class CountMaxConcecutive1s {
	public static int method(int[] ar) {
		int max_c=0,cur_c=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==1) {
				cur_c++;
			}else {
				cur_c=0; //reset
			}
			max_c=Math.max(max_c, cur_c);  
		}
		return max_c;
	}

	public static void main(String[] args) {
		//int[] ar= {1,1,0,1,1,1};
		int[] ar={1,0,1,1,0,1};
		System.out.println(method(ar));
	}

}
