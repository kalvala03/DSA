package arrays;

public class JumpGame2 {

	//Tc:O(n)   sc:O(1)
	public static int jump(int[] nums) {
        int jumps=0,l=0,r=0;
        while(r<nums.length-1){
            int fastest=0;
            for(int i=l;i<=r;i++){
                fastest=Math.max(fastest,i+nums[i]);
            }
            l=r+1;
            r=fastest;
            jumps+=1;
        }
        return jumps;
    }
	public static void main(String[] args) {
		int[] nums= {2,3,1,1,4};
		System.out.println(jump(nums));
	}
}
