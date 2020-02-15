package io.github.pratikrane.problems.problem2;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(val).append(' ');
		ListNode print = next;
		while (print != null) {
			sb.append(print.val).append(' ');
			print = print.next;
		}
		return sb.toString();
	}
}
