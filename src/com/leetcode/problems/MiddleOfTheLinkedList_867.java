package com.leetcode.problems;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfTheLinkedList_867 {
	public static void main(String[] args) {
		ListNode l6 = new ListNode(6);
		ListNode l5 = new ListNode(5, l6);
		ListNode l4 = new ListNode(4,l5);
		ListNode l3 = new ListNode(3,l4);
		ListNode l2 = new ListNode(2,l3);
		ListNode l1 = new ListNode(1,l2);
		
		ListNode result = betterMiddleNode(l1);
		System.out.println(result.val);
	}

	public static ListNode middleNode(ListNode head) {
		
		if (head == null)
			return null;
		
		ListNode currentNode = head;
		int length = 0;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		int count = 1;
		while (count < length/2 + 1) {
			head = head.next;
			count++;
		}
		return head;
	}

	public static ListNode betterMiddleNode(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next; //2 steps
			slow = slow.next; //1 step
		}
		return slow;
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
