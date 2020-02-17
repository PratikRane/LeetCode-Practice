package io.github.pratikrane.problems.problem739;

import java.util.Stack;

public class Solution {

	private final Stack<Integer> stack;

	public Solution() {
		stack = new Stack<Integer>();
	}

	public int[] dailyTemperatures(int[] T) {
		stack.clear();
		final int[] result = new int[T.length];
		for (int i = T.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && T[stack.peek()] <= T[i]) {
				stack.pop();
			}
			result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
			stack.push(i);
		}
		return result;
	}

}
