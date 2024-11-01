package com.leetcode.problems.seanprashad;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {
	public static void main(String[] args) {
		int[] nums = new int[]{2,2,2,1};
		System.out.println(singleNumber(nums));
		//System.out.println(XorSingleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		//1 - num, 2 - count
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			if (item.getValue() == 1)
				return item.getKey();
		}
		return 0;
	}
	
	public static int XorSingleNumber(int[] nums) {
		int mask = 0;
		for (int num : nums) {
			mask ^= num;
		}
		return mask;
	}
}
