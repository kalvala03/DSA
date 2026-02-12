package binarysearchOn1D;

//744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {

	public static char nextGreatestLetter(char[] letters, char target) {
		int low=0;
		int high=letters.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(target<letters[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return letters[low % letters.length];   //always returns first char of the element i.e 4%4==0
	}
	
	public static void main(String[] args) {
		char[] letters= {'c','f','j'};
		char target='d';
		//char target='c';
        System.out.println(nextGreatestLetter(letters,target));
	}

}
