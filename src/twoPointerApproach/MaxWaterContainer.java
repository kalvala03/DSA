package twoPointerApproach;

//11. Container With Most Water-->https://leetcode.com/problems/container-with-most-water

public class MaxWaterContainer {
	
	//brute force-->Tc:O(n^2)
	public static int method(int[] height) {
		int maxWater=0;
		for(int i=0;i<height.length;i++) {
			for(int j=i+1;j<height.length;j++) {
				int width=j-i;
				int ht=Math.min(height[i],height[j]);
				int curWater=width*ht;
				maxWater=Math.max(maxWater, curWater);
			}
		}
		return maxWater;
	}
	
	//Optimized:Two pointer approach-->Tc:O(n)
	public static int method1(int[] height) {
		int lp=0,rp=height.length-1;
		int maxWater=0;
		while(lp<rp) {
			int width=rp-lp;
			int ht=Math.min(height[lp],height[rp]);
			int curWater=width*ht;
			maxWater=Math.max(maxWater, curWater);
			
			if(height[lp]<height[rp]) {
				lp++;
			}else {
				rp--;
			}
		}
		return maxWater;
	
	}
	
	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println(method1(height));
	}

}