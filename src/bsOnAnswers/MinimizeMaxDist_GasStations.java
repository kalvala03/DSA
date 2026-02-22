package bsOnAnswers;

import java.util.PriorityQueue;

public class MinimizeMaxDist_GasStations {
	//BruteForce-->TC:O(k*n)+O(n),SC:(n-1)
	static double brute(int[] ar,int k) {
		int[] NoOfStationsInSec=new int[ar.length-1];
		for(int gasStations=1;gasStations<=k;gasStations++) {
			double maxSec=-1;
			int maxIdx=-1;
			//find the segment with max distance
			for(int i=0;i<ar.length-1;i++) {
				double diff=ar[i+1]-ar[i];
				double secLen=diff/(NoOfStationsInSec[i]+1.0);
				if(secLen>maxSec) {
					maxSec=secLen;
					maxIdx=i;
				}
			}
			//Add gasStations to the selected segment
			NoOfStationsInSec[maxIdx]++;
		}
		
		//find the final max secLen after placing all gasStations
		double maxAns=-1;
		for(int i=0;i<ar.length-1;i++) {
			double diff=ar[i+1]-ar[i];
			double secLen=diff/(NoOfStationsInSec[i]+1.0);
			maxAns=Math.max(maxAns, secLen);
		}
		return maxAns;
	}
	//BetterApproach
	public static double better(int[] ar, int k) {
	    int n = ar.length;

	    // howMany[i] = number of extra stations inserted in the gap between ar[i] and ar[i+1]
	    int[] howMany = new int[n - 1];


	    // By default Java PriorityQueue gives smallest element first (Min Heap)
	    // We reverse comparison so that largest distance comes first (Max Heap)
	    // Each element stored as:
	    // {current gap length, gap index}
	    PriorityQueue<double[]> pq =new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

	    // Insert initial gaps between stations into pq
	    for (int i = 0; i < n - 1; i++) {
	        double gap = ar[i+1] - ar[i];
	        pq.add(new double[]{gap, i});
	    }
	    // Add k extra gas stations
	    for (int gasStations = 1; gasStations <= k; gasStations++) {

	        // Take the gap with maximum distance
	        double[] top = pq.poll();

	        int secInd = (int) top[1];

	        // We place one station in this gap
	        howMany[secInd]++;

	        // Original gap length
	        double iniDiff = ar[secInd+1] - ar[secInd];

	        // New maximum segment length after split
	        // If x stations inserted -> gap divided into (x+1) parts
	        double newSecLen = iniDiff / (howMany[secInd] + 1);

	        // Push updated gap back to heap
	        pq.add(new double[]{newSecLen, secInd});
	    }
	    // Top of heap now contains the largest remaining gap
	    return pq.peek()[0];
	}
	
	//Optimal approach
	public static double optimal(int[] ar, int k) {
		int n=ar.length;
		double low=0,high=0;
		for(int i=0;i<n-1;i++) {
			high=Math.max(high, ar[i+1]-ar[i]);
		}
		while(high-low>1e-6) {  //10^6
			double mid=low+(high-low)/2;
			int count=noOfGasStationsReq(mid,ar);
			if(count>k) {
				low=mid;
			}else {
				high=mid;
			}
		}
		return high;
	}
	

	public static int noOfGasStationsReq(double dist, int[] ar) {
		int count=0;
		for(int i=0;i<ar.length-1;i++) {
			int gasesInBetween=(int)((ar[i+1]-ar[i])/dist);
			//if it divides exactly
			if((ar[i+1]-ar[i])==dist*gasesInBetween) {
				gasesInBetween--;
			}
			count+=gasesInBetween;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] ar= {1,13,17,23};
		//int[] ar={1,2,3,4,5}; -->o/p: 0.5
		int k=5;
		System.out.println(optimal(ar,k));
	}
}
