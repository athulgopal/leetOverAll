package leet;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p != null && q != null) {
			if (p.val != q.val)
				return false;
			else {
				if(!isSameTree(p.left, q.left)) return false;
				if(!isSameTree(p.right, q.right)) return false;
			}
		} else if (p != null && q == null) {
			return false;
		} else if (p == null && q != null) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		SameTree tree=new SameTree();
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(0);
		TreeNode node3=new TreeNode(2);
		TreeNode node4=new TreeNode(1);
		TreeNode node5=new TreeNode(1);
		
		node1.left=node2;
		node1.right=node3;
		
		node4.left=node5;
		System.out.println(tree.isSameTree(node1, node4));
	}
}
