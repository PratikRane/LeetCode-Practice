package io.github.pratikrane.problems.problem556;

import java.util.Arrays;

public class Solution {
	private int findNext(char[] number, int n) {
		int i;
		for (i = n - 1; i > 0; i--) {
			if (number[i] > number[i - 1]) {
				break;
			}
		}

		if (i == 0) {
			return -1;
		}

		int min = i;
		final char x = number[i - 1];
		for (int j = i + 1; j < n; j++) {
			if (number[j] > x && number[j] < number[min]) {
				min = j;
			}
		}
		swap(number, min, i - 1);
		Arrays.sort(number, i, n);
		return Integer.parseInt(String.copyValueOf(number));
	}

	public int nextGreaterElement(int n) {
		final char[] number = Integer.toString(n).toCharArray();
		return findNext(number, number.length);
	}

	private void swap(char[] array, int i, int j) {
		final char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
