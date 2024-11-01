package com.leetcode.problems.seanprashad;

import java.util.*;

public class CyclicSort_448 {
	public static void main(String[] args) {
		int[] nums = new int[] {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		//sort array
		int i = 0;
		while (i < nums.length) {
			int pos = nums[i] - 1;
			if (nums[i] != nums[pos]) {
				int temp = nums[i];
				nums[i] = nums[pos];
				nums[pos] = temp;
			} else
				++i;
		}

		//System.out.println(Arrays.toString(nums));
		
		List<Integer> returnedList = new ArrayList<>();

		for (int j = 0; j < nums.length; j++) {
			if (j + 1 != nums[j]) {
				returnedList.add(j+1);
			}
		}
		return returnedList;
		
	}
}
