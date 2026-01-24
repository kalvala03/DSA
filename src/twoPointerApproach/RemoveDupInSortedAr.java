package twoPointerApproach;

//26. Remove Duplicates from Sorted Array-->https://leetcode.com/problems/remove-duplicates-from-sorted-array
//Tc:O(n),Sc:O(1)----->used two pointer approach

public class RemoveDupInSortedAr {
	public static int method(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

	public static void main(String[] args) {
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		int k=method(nums);
		System.out.println("Unique count:"+k);
		System.out.println("Array after removing duplicates:");
		for(int x=0;x<k;x++) {
			System.out.print(nums[x]+" ");
		}
	}

}
