package io.github.pratikrane.problems.problem13;

public class Solution {
	private int returnValue(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
	}

	public int romanToInt(String s) {
		int sum = 0, lastVal = 0;
		for (int index = s.length() - 1; index >= 0; index--) {
			final char current = s.charAt(index);
			final int newVal = returnValue(current);
			if (newVal < lastVal) {
				sum -= newVal;
			} else {
				sum += newVal;
			}
			lastVal = newVal;
		}
		return sum;
	}
}
