package io.github.pratikrane.problems.problem496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		final int[] result = new int[findNums.length];
		final Map<Integer, Integer> map = new HashMap<>();
		final Stack<Integer> stack = new Stack<>();
		for (final int num : nums) {
			while (!stack.isEmpty() && stack.peek() < num) {
				map.put(stack.pop(), num);
			}
			stack.push(num);
		}
		for (int i = 0; i < findNums.length; i++) {
			result[i] = map.getOrDefault(findNums[i], -1);
		}

		return result;
	}

	public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
		final int[] results = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			results[i] = -1;
			boolean found = false;
			for (final int element : nums2) {
				if (!found) {
					if (element == nums1[i]) {
						found = true;

					}
					continue;
				}
				if (element > nums1[i]) {
					results[i] = element;
					break;
				}
			}
		}

		return results;
	}
}