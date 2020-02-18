package io.github.pratikrane.problems.problem189;

import java.util.Arrays;

public class Solution {
	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			final int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public void rotate(int[] nums, int k) {
		k %= nums.length;
		int start = 0;
		int count = 0;
		while (count < nums.length) {
			int prev = nums[start];
			int current = start;

			do {
				final int next = (current + k) % nums.length;
				final int temp = nums[next];
				nums[next] = prev;
				prev = temp;
				current = next;
				count++;
			} while (start != current);

			System.out.println(Arrays.toString(nums));
			start++;
		}
	}

	public void rotate1(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
}
