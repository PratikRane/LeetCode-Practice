package io.github.pratikrane.problems.problem2;

//Add Two Numbers
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Example:
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 4650 = 807.

//@formatter:off
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
//@formatter:on
public class Add2Numbers {

	public static void main(String[] args) {

		final Add2Numbers solution = new Add2Numbers();

		final ListNode list1 = new ListNode(6);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(5);
		list1.next.next.next = new ListNode(0);
		list1.next.next.next.next = new ListNode(4);
		list1.next.next.next.next.next = new ListNode(4);
		list1.next.next.next.next.next.next = new ListNode(9);
		list1.next.next.next.next.next.next.next = new ListNode(4);
		list1.next.next.next.next.next.next.next.next = new ListNode(1);
		final ListNode list2 = new ListNode(3);
		list2.next = new ListNode(8);
		list2.next.next = new ListNode(8);
		list2.next.next.next = new ListNode(0);
		list2.next.next.next.next = new ListNode(3);
		list2.next.next.next.next.next = new ListNode(0);
		list2.next.next.next.next.next.next = new ListNode(1);
		list2.next.next.next.next.next.next.next = new ListNode(4);
		list2.next.next.next.next.next.next.next.next = new ListNode(8);
		System.out.println(solution.addTwoNumbers(list1, list2));

	}

	public ListNode addNumbers(ListNode number1, ListNode number2, ListNode carry) {
		if (number1 == null && number2 == null) {
			return carry;
		}
		final int num1 = number1 != null ? number1.val : 0;
		final int num2 = number2 != null ? number2.val : 0;
		final int carryVal = carry != null ? carry.val : 0;
		final int sum = num1 + num2 + carryVal;
		final ListNode newCarry = sum / 10 == 0 ? null : new ListNode(sum / 10);
		final ListNode value = new ListNode(sum % 10);
		value.next = addNumbers(number1.next, number2.next, newCarry);
		return value;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		final ListNode carry = new ListNode(0);
		return addNumbers(l1, l2, carry);
	}
}
