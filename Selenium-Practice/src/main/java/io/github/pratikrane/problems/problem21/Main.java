package io.github.pratikrane.problems.problem21;

public class Main {

	public static void main(String[] args) {
		final ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		final ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		final Solution sol = new Solution();
		ListNode result = sol.mergeTwoLists(l1, l2);
		while (result != null) {
			System.out.print(" " + result.val);
			result = result.next;
		}

	}

}
