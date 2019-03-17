package leet;

import java.util.ArrayList;
import java.util.List;

public class TreePath {
	List<String> pathList = new ArrayList<>();
	public List<String> binaryTreePaths(TreeNode root) {
		
		if(root!=null)
			iteration(root, "");
		return pathList;
	}

	public void iteration(TreeNode node, String val) {
		val = val + node.val + " -> ";
		if(node.left !=null)
			iteration(node.left, val);
		if(node.right !=null)
			iteration(node.right, val);
		if (node.left == null && node.right == null) {
			pathList.add(val.substring(0, val.length() - 3));
		}
	}

	public static void main(String[] args) {

		TreePath path = new TreePath();
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.left = node2;
		node2.right = node5;
		node1.right = node3;
		for(String s:path.binaryTreePaths(node1)) {
			System.out.println(s);
		}
	}
}
