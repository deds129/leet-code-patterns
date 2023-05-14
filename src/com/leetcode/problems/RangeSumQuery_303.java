package com.leetcode.problems;


//source: https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSumQuery_303 {

	public static void main(String[] args) {
		
		
		int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
		
		NumArray numArray = new NumArray(nums);
		numArray.sumRange(0, 2);
		numArray.sumRange(2, 5);
		numArray.sumRange(0, 5);
	}

	/**
	 * Your NumArray object will be instantiated and called as such:
	 * NumArray obj = new NumArray(nums);
	 * int param_1 = obj.sumRange(left,right);
	 */
	static class NumArray {
		
		private int nums[];

		public NumArray(int[] nums) {
			this.nums = nums;
		}

		public int sumRange(int left, int right) {
			int sum = 0;
			for (int i = left; i <= right; i++) {
				sum += nums[i];
			}
			//System.out.println(sum);
			return sum;
		}
	}

	
	
}
