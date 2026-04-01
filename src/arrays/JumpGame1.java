package arrays;

public class JumpGame1 {
	 public static boolean canJump(int[] nums) {
	        int maxIdx=0;
	        for(int i=0;i<nums.length;i++){
	            if(i>maxIdx)
	                return false;
	            maxIdx=Math.max(maxIdx,i+nums[i]);
	        }
	        return true;
	    }

	public static void main(String[] args) {
		int[] nums= {3,2,1,0,4};
		System.out.println(canJump(nums));
	}
}
