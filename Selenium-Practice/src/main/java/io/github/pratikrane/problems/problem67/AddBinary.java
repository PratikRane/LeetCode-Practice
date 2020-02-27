package io.github.pratikrane.problems.problem67;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*67. Add Binary
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"*/

public class AddBinary {

	public static void main(String[] args) {

		final DateTimeFormatter fr = DateTimeFormatter.ISO_LOCAL_DATE;
		final LocalDate d1 = LocalDate.parse("2019-12-31", fr);
		final LocalDate d2 = LocalDate.parse("2020-01-15", fr);
		System.out.println(d2.until(d1, ChronoUnit.DAYS));

		final Solution sol = new Solution();
		System.out.println(sol.addBinary("11", "1"));
	}

}
