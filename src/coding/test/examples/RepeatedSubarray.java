package coding.test.examples;

public class RepeatedSubarray {

	public static int findLength(int[] nums1, int[] nums2) {

		int[] input1 = new int[101];
		for (int i = 0; i < nums1.length; i++) {
			input1[nums1[i]] = input1[nums1[i]] + 1;
		}

		int count = 0;
		for (int i = 0; i < nums2.length; i++) {
			if (input1[nums2[i]] != 0) {
				count++;
				input1[nums2[i]] = input1[nums2[i]] - 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 2, 1, 7, 7, 8, 4 };
		int[] nums2 = { 3, 2, 1, 4, 7, 1, 8 };

		System.out.println(findLength(nums1, nums2));
		assert (findLength(nums1, nums2) == 5) : "fail";

		int[] nums3 = { 0, 0, 0, 0, 0 };
		int[] nums4 = { 0, 0, 0, 0, 0, 0, 0 };

		System.out.println(findLength(nums3, nums4));
		assert (findLength(nums3, nums4) == 5) : "fail";
	}

}

//Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.
//
//		 
//
//Example 1:
//
//Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
//Output: 3
//Explanation: The repeated subarray with maximum length is [3,2,1].
//Example 2:
//
//Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
//Output: 5
//
//Constraints:
//
//1 <= nums1.length, nums2.length <= 1000
//0 <= nums1[i], nums2[i] <= 100