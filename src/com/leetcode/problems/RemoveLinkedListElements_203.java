package com.leetcode.problems;

// https://leetcode.com/problems/remove-linked-list-elements/

import org.w3c.dom.ls.LSOutput;

public class RemoveLinkedListElements_203 {

	public static void main(String[] args) {
		ListNode l7 = new ListNode(7, null);
		ListNode l6 = new ListNode(7, l7);
		ListNode l5 = new ListNode(7, l6);
		ListNode l4 = new ListNode(7, l5);
		ListNode l3 = new ListNode(7, l4);
		ListNode l2 = new ListNode(7, l3);
		ListNode l1 = new ListNode(7, l2);

		int val = 7;
		printListNodes(l1);
		ListNode returned = removerLinkedListLastElement(l1, val);
		printListNodes(returned);

	}

	public static ListNode removerLinkedListLastElement(ListNode head, int removeVal) {
		ListNode result = new ListNode(0);
		result.next = head;

		ListNode currentNode = result;
		while (currentNode.next != null) {
			if (currentNode.next.val == removeVal) {
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
