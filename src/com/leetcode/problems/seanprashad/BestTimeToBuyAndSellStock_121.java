package com.leetcode.problems.seanprashad;

import java.util.Arrays;
import java.util.Collections;

// source: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock_121 {

	public static void main(String[] args) {
		int[] testPrices = {7,6,4,3,1};
		int[] testPrices2 = {7,6,4,8,5};
		int[] testPrices3 = {1,6};
		System.out.println(maxProfit(testPrices2));
		System.out.println(naiveMaxProfit(testPrices2));
	}

	/*
	Мысленная концепция которая сложилась:
	
	Вместо использования вложенных циклов и одной операции,
	зачастую можно использовать один цикл и несколько операций в цикле,
	одна из операций выполняется для следующей итерации.
	
	Т.е. в данном кейсе 
	1) 2 уровня вложенности цикла + 1 операция
	2) 1 Цикл + 2 операции, одна из которых "пост-" операция
	 */
	
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int currentMin = prices[0];
		for (int i = 0; i < prices.length; i++) {
			maxProfit = Collections.max(Arrays.asList(maxProfit, prices[i] - currentMin));
			currentMin = Collections.min(Arrays.asList(currentMin, prices[i]));
		}
		return maxProfit;
	}

	public static int naiveMaxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] < prices[j]) {
					int currentProfit = prices[j] - prices[i];
					if (maxProfit < currentProfit) {
						maxProfit = currentProfit;
					}
				}
			}
		}
		return maxProfit;
	}
}
