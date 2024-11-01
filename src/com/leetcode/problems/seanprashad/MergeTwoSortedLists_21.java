package com.leetcode.problems.seanprashad;

//https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedLists_21 {

	public static void main(String[] args) {

		ListNode secondListNode4 = new ListNode(5, null);
		ListNode secondListNode3 = new ListNode(4, secondListNode4);
		ListNode secondListNode2 = new ListNode(3, secondListNode3);
		ListNode secondListNode1 = new ListNode(1, secondListNode2);
		
		
		ListNode firstListNode3 = new ListNode(4, null);
		ListNode firstListNode2 = new ListNode(2, firstListNode3);
		ListNode firstListNode1 = new ListNode(1, firstListNode2);
		
		printListNodes(firstListNode1);
		printListNodes(secondListNode2);
		ListNode returned = mergeTwoSortedLists(firstListNode1, secondListNode1);
		printListNodes(returned);
		
	}

	private static ListNode mergeTwoSortedLists(ListNode firstListNode1, ListNode secondListNode1) {
		
		ListNode merged = new ListNode(0);
		ListNode result = merged;
		
		while (firstListNode1 != null && secondListNode1 != null) {
			if (firstListNode1.val < secondListNode1.val) {
				merged.next = new ListNode(firstListNode1.val);
				firstListNode1 = firstListNode1.next;
			} else {
				merged.next = new ListNode(secondListNode1.val);
				secondListNode1 = secondListNode1.next;
			}
			merged = merged.next;
		}
		
		while (firstListNode1 != null) {
			merged.next = new ListNode(firstListNode1.val);
			firstListNode1 = firstListNode1.next;
			merged = merged.next;
		}

		while (secondListNode1 != null) {
			merged.next = new ListNode(secondListNode1.val);
			secondListNode1 = secondListNode1.next;
			merged = merged.next;
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
