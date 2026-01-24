package com.mathsforDSA;

public class ArmstrongInRange {
	//works only till three digit numbers
	public static void method(int n1,int n2) {
		for(int i=n1;i<n2;i++) {
			int sum=0,M=i;
			while(M>0) {
				int r=M%10;
				sum=sum+r*r*r;
				M/=10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
	
	//O(N⋅d^2)​
	public static void method1(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {

            // Step 1: count digits
        	int digits=0;
        	int t1=i;
            while(t1>0) {
            	digits++;
            	t1/=10;
            }
            // Step 2: Armstrong calculation
            int t2=i;
            int sum=0;
            while(t2>0) {
            	int rem=t2%10;
            	int power=1,c=digits;
            	while(c>0) {
            		power=power*rem;
            		c--;
            	}
            	sum+=power;
            	if(sum>i)
            		break;
            	t2/=10;
            	
            }
           
            // Step 3: check
           if(sum==i) {
        	   System.out.println(i);
           }
        }
    }
	
	public static void main(String[] args) {
		//method(100,2000);
		method1(100,2000);
	}

}
