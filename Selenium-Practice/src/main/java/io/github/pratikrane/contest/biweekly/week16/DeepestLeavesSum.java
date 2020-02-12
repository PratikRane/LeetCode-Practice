package io.github.pratikrane.contest.biweekly.week16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given a binary tree, return the sum of values of its deepest leaves.
//Example 1:
//	Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
//			Output: 15
//				  1
//			  2	  	  3
//			4	5		6
//		  7				  8
//
//			Constraints:
//			The number of nodes in the tree is between 1 and 10^4.
//			The value of nodes is between 1 and 100.
public class DeepestLeavesSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(56);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(-1);
		DeepestLeavesSum sum = new DeepestLeavesSum();
		System.out.println(sum.deepestLeavesSum(root));

	}

	public int deepestLeavesSum(TreeNode root) {
		int sum = 0;
		Map<Integer, List<TreeNode>> allNodes = new HashMap<>();
		List<TreeNode> list = new ArrayList<TreeNode>();
		list.add(root);
		allNodes.put(0, list);
		int currentLevel = 0;
		for (currentLevel = 0;; currentLevel++) {
			List<TreeNode> nodes = allNodes.getOrDefault(currentLevel, null);
			if (nodes == null)
				break;
			List<TreeNode> newLevel = new ArrayList<TreeNode>();
			for (TreeNode node : nodes) {
				if (node.left != null)
					newLevel.add(node.left);
				if (node.right != null)
					newLevel.add(node.right);
			}
			if (newLevel.size() != 0) {
				allNodes.remove(currentLevel);
				allNodes.put(currentLevel + 1, newLevel);
			}

		}

		for (TreeNode node : allNodes.get(--currentLevel)) {
			sum += node.val;
		}
		return sum;
	}

}
