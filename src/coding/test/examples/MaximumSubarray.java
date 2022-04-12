package coding.test.examples;

import java.util.Arrays;

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		int maxValue=0;
		
	    for(int j=0;j<nums.length;j++) {
	    	int lastValue=nums[j];
		    for(int i=j+1;i<nums.length;i++) {
		    	if(nums[i]+lastValue>maxValue) {
		    		maxValue=nums[i]+lastValue;
		    	}
		    	lastValue=lastValue+nums[i];
		    }
	    }   
		return maxValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1 = {-2,1,-3,4,-1,2,1,25,4};
		System.out.println(Arrays.toString(nums1) +" = "+maxSubArray(nums1));
		
		int []nums2 = {5,4,-1,7,8};
		System.out.println(Arrays.toString(nums2) +" = "+maxSubArray(nums2));
	}

}


//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//A subarray is a contiguous part of an array.
//
// 
//
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23