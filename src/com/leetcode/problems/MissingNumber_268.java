package com.leetcode.problems;

class MissingNumber_268 {
	public static void main(String[] args) {
		int[] nums = new int[]{0,1,2,4};
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		return n * (n + 1) / 2 - sum(nums);
	}

	public static int sum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		return sum;
	}
}
