package com.leetcode.problems;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicatesFromSortedList_83 {

	public static void main(String[] args) {
		ListNode l5 = new ListNode(0, null);
		ListNode l4 = new ListNode(0, l5);
		ListNode l3 = new ListNode(0, l4);
		ListNode l2 = new ListNode(0, l3);
		ListNode l1 = new ListNode(0, l2);
		
		printListNodes(l1);
		ListNode returned = removeDuplicatesFromList(l1);
		printListNodes(returned);

	}

	public static ListNode removeDuplicatesFromList(ListNode head) {
		ListNode result = new ListNode(-101);
		result.next = head;

		ListNode currentNode = result;
		while (currentNode.next != null) {
			if (currentNode.val == currentNode.next.val) {
				currentNode.next = currentNode.next.next;
			} else {
				currentNode = currentNode.next;
			}
		}
		return result.next;
	}


	static class ListNode {
		int val;
		ListNode next;

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode() {
		}

	}


	public static void printListNodes(ListNode head) {
		StringBuilder strVal = new StringBuilder();
		while (head != null) {
			strVal.append(head.val + "->");
			head = head.next;
		}
		strVal.append("null");
		System.out.println(strVal.toString());
	}
}
