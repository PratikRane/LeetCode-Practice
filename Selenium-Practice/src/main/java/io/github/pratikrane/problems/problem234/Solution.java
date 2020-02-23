package io.github.pratikrane.problems.problem234;

import java.util.Stack;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

public class Solution {
	public boolean isPalindrome(ListNode head) {
		final Stack<ListNode> stack = new Stack<>();
		int count = 0;
		ListNode walker = head;
		while (walker != null) {
			stack.push(walker);
			walker = walker.next;
			count++;
		}
		boolean palindrome = true;
		count /= 2;
		while (count > 0 && !stack.isEmpty()) {
			if (head.val != stack.pop().val) {
				palindrome = false;
				break;
			}
			head = head.next;
			count--;
		}

		return palindrome;
	}

}
