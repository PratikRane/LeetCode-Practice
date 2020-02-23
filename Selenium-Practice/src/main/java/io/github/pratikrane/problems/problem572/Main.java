package io.github.pratikrane.problems.problem572;

//572. Subtree of Another Tree
//Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
//
//Example 1:
//Given tree s:
//
//     3
//    / \
//   4   5
//  / \
// 1   2
//Given tree t:
//   4
//  / \
// 1   2
//Return true, because t has the same structure and node values with a subtree of s.
//Example 2:
//Given tree s:
//
//     3
//    / \
//   4   5
//  / \
// 1   2
//    /
//   0
//Given tree t:
//   4
//  / \
// 1   2
//Return false.

public class Main {

	public static void main(String[] args) {
		final TreeNode s = new TreeNode(3);
		s.left = new TreeNode(4);
		s.right = new TreeNode(5);
		s.left.left = new TreeNode(1);
		s.left.right = new TreeNode(2);
		s.left.right.left = new TreeNode(0);

		final TreeNode t = new TreeNode(4);
		t.left = new TreeNode(1);
		t.right = new TreeNode(2);

		final Solution sol = new Solution();
		System.out.println(sol.isSubtree(s, t));
	}

}
