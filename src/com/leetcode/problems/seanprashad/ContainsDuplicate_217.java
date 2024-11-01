package com.leetcode.problems.seanprashad;

import java.util.*;

public class ContainsDuplicate_217 {

    public static void main(String[] args) {
		int test[] = {1,2,3,1};
		int test2[] = {1,2,3,4,4};
		System.out.println(containsDuplicate(test));
		System.out.println(containsDuplicate(test2));
    }
	
	
	public static   boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length);
		for (int i : nums) {
			set.add(i);
		}
			return nums.length == set.size();
	}
}


