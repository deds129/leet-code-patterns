package com.leetcode.problems.livecoding_interviews;

import java.util.HashMap;
import java.util.Map;

/*
Посчитать кол-во вхождений повторяющегося элемента в массив и вывести их (неповторяющиеся элементы не выводим). В 
массиве только положительные целые числа. Все можно делать в методе main. [5,3,1,2,1,2,3,3]
Пример: 1->2
2->2
3->3
5->не выводим
 */
public class LiveCoding1 {
	public static void main(String[] args) {
		int[] nums = new int[]{5, 3, 1, 2, 1, 2, 3, 3};
		missingNumber(nums);
	}

	public static void missingNumber(int[] nums) {
		//1 - num, 2 - count
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			if (item.getValue() != 1) {
				System.out.println(item.getKey() + "->" + item.getValue());
			}
		}
	}
}
