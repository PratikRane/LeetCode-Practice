package io.github.pratikrane.problems.problem67;

public class Solution {

	public String addBinary(String a, String b) {
		if (a.length() < b.length()) {
			return addBinary(b, a);
		}

		final int L = a.length(), j = b.length() - 1;
		int carry = 0;
		final StringBuilder sb = new StringBuilder();
		for (int i = L - 1; i > -1; i--) {
			if (a.charAt(i) == '1') {
				carry++;
			}
			if (j > -1 && b.charAt(j) == '1') {
				carry++;
			}
			if (carry % 2 == 1) {
				sb.append('1');
			} else {
				sb.append('0');
			}
			carry >>= 1;
		}
		if (carry == 1) {
			sb.append('1');
		}
		return sb.reverse().toString();
	}

	public String addBinary2(String a, String b) {
		return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));

	}
}
