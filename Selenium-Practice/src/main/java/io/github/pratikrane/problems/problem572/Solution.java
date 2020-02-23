package io.github.pratikrane.problems.problem572;

public class Solution {
	private boolean isEqual(TreeNode s, TreeNode t) {
		if (s == null && t == null) {
			return true;
		}
		if (s == null || t == null) {
			return false;
		}
		if (s.val != t.val) {
			return false;
		}
		return isEqual(s.left, t.left) && isEqual(s.right, t.right);
	}

	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null && t == null) {
			return true;
		}

		if (s == null || t == null) {
			return false;
		}

		return (isEqual(s, t)) || isSubtree(s.left, t) || isSubtree(s.right, t);
	}
}