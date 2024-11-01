package com.leetcode.problems.seanprashad;

public class ReverseLinkedList_206 {
	public static void main(String[] args) {
		ListNode l6 = new ListNode(6);
		ListNode l5 = new ListNode(5, l6);
		ListNode l4 = new ListNode(4,l5);
		ListNode l3 = new ListNode(3,l4);
		ListNode l2 = new ListNode(2,l3);
		ListNode l1 = new ListNode(1,l2);

		System.out.println(reverseList(l1).val);
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode prev = null;
		ListNode currentNode = head;
		while (currentNode != null) {
			ListNode next = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = next;
		}
		return prev;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
