package com.leetcode.problems;

public class PalindromeLinkedList_234 {
	public static void main(String[] args) {

		ListNode l6 = new ListNode(1);
		ListNode l5 = new ListNode(2, l6);
		ListNode l4 = new ListNode(3, l5);
		ListNode l3 = new ListNode(3, l4);
		ListNode l2 = new ListNode(2, l3);
		ListNode l1 = new ListNode(1, l2);

		System.out.println(isPalindrome(l1));

	}

	public static boolean isPalindrome(ListNode head) {
		if (head == null)
			return false;
		
		ListNode currentLinkedList = head;
		ListNode middle = middleNode(currentLinkedList);
		ListNode reversedMiddle = reverseList(middle);
		
		while (reversedMiddle != null) {
			if (reversedMiddle.val != currentLinkedList.val) {
				return false;
			}
			reversedMiddle = reversedMiddle.next;
			currentLinkedList = currentLinkedList.next;
		}
		return true;
	}

	public static ListNode middleNode(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast !=  null && fast.next != null) {
			fast = fast.next.next; //2 steps
			slow = slow.next; //1 step
		}
		return slow;
	}

	public static ListNode reverseList(ListNode head) {
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

	static class ListNode {

		ListNode next;
		int val;

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode() {
		}

		public ListNode(int val, ListNode next) {
			this.next = next;
			this.val = val;
		}
	}
}
