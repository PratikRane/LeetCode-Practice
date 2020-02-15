package io.github.pratikrane.problems.problem12;

public class Solution {
	public String intToRoman(int num) {
		final String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		final int[] integers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < integers.length; i++) {
			while (num >= integers[i]) {
				num -= integers[i];
				sb.append(roman[i]);
			}
		}
		return sb.toString();
	}
}
