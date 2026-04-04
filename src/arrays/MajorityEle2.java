package arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityEle2 {
	static List<Integer> method(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int c1=0,c2=0,e1=0,e2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=e2){
                e1=nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=e1){
                e2=nums[i];
                c2=1;
            }
            else if(e1==nums[i]){
                c1++;
            }
            else if(e2==nums[i]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        //verify
        c1=0;
        c2=0;
        for(int num:nums){
            if(num==e1)
                c1++;
            else if(num==e2)
                c2++;
        }

        int n=nums.length;
        if(c1>n/3){
            ans.add(e1);
        }
        if(c2>n/3){
            ans.add(e2);
        }
        return ans;
    }
	
	public static void main(String[] args) {		
		int[] nums= {1,1,1,3,3,2,2,2};
		System.out.println(method(nums));
	}
}
