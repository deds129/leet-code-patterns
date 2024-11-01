package com.leetcode.problems.seanprashad;


// https://leetcode.com/problems/maximum-subarray/

public class MaximumSubarray_53 {

	public static void main(String[] args) {
		int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			currentSum = Math.max(currentSum + num, num);
			maxSum = Math.max(currentSum, maxSum);
		}
		
		return maxSum;
		
	}

}
