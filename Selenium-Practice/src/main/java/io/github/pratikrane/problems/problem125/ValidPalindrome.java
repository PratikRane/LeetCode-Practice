package io.github.pratikrane.problems.problem125;

/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 * */

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s.isBlank()) {
			return true;
		}
		int head = 0, tail = s.length() - 1;
		while (head <= tail) {
			char cHead = s.charAt(head);
			char cTail = s.charAt(tail);
			if (!Character.isLetterOrDigit(cHead)) {
				head++;
				cHead = s.charAt(head);
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
				cTail = s.charAt(tail);
			} else {
				if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}
		}
		return true;

	}

	public boolean isPalindrome1(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		return s.equalsIgnoreCase(new StringBuffer(s).reverse().toString());
	}

}