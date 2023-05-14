package com.leetcode.problems;

// https://leetcode.com/problems/linked-list-cycle/
// Алгоритм Зайца и Черепашки, Floyd and Turtle 
public class LinkedListCycle_141 {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		//n4.next = n2;

		System.out.println(hasCycle(n1));
	}
	
	public static boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next; //2 steps
			slow = slow.next; //1 step
			if (slow.equals(fast)) {
				return true;
			}
		}
		return false;
	}
	


	static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
