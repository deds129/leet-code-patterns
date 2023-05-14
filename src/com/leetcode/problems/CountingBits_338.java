package com.leetcode.problems;


import java.util.Arrays;

// https://leetcode.com/problems/counting-bits/
public class CountingBits_338 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(1)));
	}

	public static int[] countBits(int n) {
		int[] bits = new int[n + 1];
		//O(n)
		for (int i = 0; i <= n; i++) {
			bits[i] = bits[i / 2] + i % 2;
		}
		return bits;
	}
}
