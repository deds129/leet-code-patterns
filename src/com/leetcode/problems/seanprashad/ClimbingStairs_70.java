package com.leetcode.problems.seanprashad;

// source: https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs_70 {
	
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}


	private static int climbStairs(int stepsCount) {

		if (stepsCount == 1)
			return 1;
		if (stepsCount == 2)
			return 2;
		
		int n1 = 1;
		int n2 = 2;
		int result = 0;
		for (int i = 3; i <= stepsCount; i++) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
		}
		return result;
	}
	
	private static int recursiveClimbStairs(int stepsCount) {

		if  (stepsCount == 1)
			return 1;
		if (stepsCount == 2) {
			return 2;
		}
		return climbStairs(stepsCount - 1) + climbStairs(stepsCount - 2);
	}
}
