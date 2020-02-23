package io.github.pratikrane.problems.problem297;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Codec {

	private static final String separator = ",";
	private static final String NullChar = "#";

	private TreeNode deserial(Queue<String> queue) {
		final String q = queue.poll();
		if (q.equals(NullChar)) {
			return null;
		}
		final TreeNode node = new TreeNode(Integer.parseInt(q));
		node.left = deserial(queue);
		node.right = deserial(queue);
		return node;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		return deserial(new LinkedList<String>(Arrays.asList(data.split(separator))));
	}

	private StringBuilder serial(StringBuilder sb, TreeNode root) {
		if (root == null) {
			return sb.append(NullChar).append(separator);
		}
		sb.append(root.val).append(separator);
		serial(sb, root.left);
		serial(sb, root.right);
		return sb;
	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		return serial(new StringBuilder(), root).toString();
	}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));