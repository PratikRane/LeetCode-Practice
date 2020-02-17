package io.github.pratikrane.problems.problem503;

import java.util.Stack;

public class Solution {
	public int[] nextGreaterElements(int[] nums) {
		final int[] result = new int[nums.length];
		final Stack<Integer> stack = new Stack<>();

		for (int i = 2 * nums.length; i > 0; i--) {
			while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.length]) {
				stack.pop();
			}
			result[i % nums.length] = stack.isEmpty() ? -1 : nums[stack.peek()];
			stack.push(i % nums.length);
		}

		return result;

	}

}
