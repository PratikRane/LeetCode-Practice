package io.github.pratikrane.problems.problem20;

import java.util.Stack;

//20. Valid Parentheses
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.
//
//Example 1:
//
//Input: "()"
//Output: true
//Example 2:
//
//Input: "()[]{}"
//Output: true
//Example 3:
//
//Input: "(]"
//Output: false
//Example 4:
//
//Input: "([)]"
//Output: false
//Example 5:
//
//Input: "{[]}"
//Output: true

public class Solution {
	public boolean isValid(String s) {
		final Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			final char ch = s.charAt(i);
			switch (ch) {
			case '(':
				stack.push(')');
				break;
			case '[':
				stack.push(']');
				break;
			case '{':
				stack.push('}');
				break;
			default:
				if (stack.isEmpty() || stack.pop() != ch) {
					return false;
				}

			}
		}
		return stack.isEmpty();
	}
}