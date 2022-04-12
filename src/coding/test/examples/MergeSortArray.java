package coding.test.examples;

import java.util.Arrays;

public class MergeSortArray {
	
	public static void insertAndMove(int []nums1,int insertIndex, int value){
		int oldvalue=0;
	
		for(int j=insertIndex; j<nums1.length;j++) {
			oldvalue=nums1[j];
			nums1[j]=value;
			value=oldvalue;
		}
	}
	
	public static void move(int []nums1,int [] nums2) {
		System.out.println("Before "+Arrays.toString(nums1));
	    int startWith=0;
		for(int j=0;j<nums1.length;j++) {
			
			if(startWith>=nums2.length) {
				continue;
			}
			if(nums1[j]==0 || nums1[j]>nums2[startWith]) {
				insertAndMove(nums1,j,nums2[startWith]);
				startWith++;
			}
		}
		System.out.println("After "+Arrays.toString(nums1));
	}

	public static void main(String[] args) {
		int []nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};

		move(nums1,nums2);
		
		int [] nums3 = {1,2,3,0,0,0};
		int [] nums4 = {1,1,1};
		move(nums3,nums4);
		
	}

}


//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
// 
//
//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.