package com.java.linkedlist;

public class SumOfTwoList {

	public Node sum(Node n1, Node n2) {
		Node result = null;
		int rem = 0;

		while (n1 != null || n2 != null) {
			int val = 0;
			if (n1 != null) {
				val = n1.getData();
				n1 = n1.next;
			}
			if (n2 != null) {
				val = val + n2.getData();
				n2 = n2.next;
			}
			val = val + rem;
			rem=0;
			if (val / 10 != 0) {
				rem = val / 10;
				val = val % 10;
			}
			if (result == null)
				result = new Node(val);
			else
				result.addNodeAtEnd(val);
		}
		return result;
	}

	public static void main(String[] args) {
		SumOfTwoList twoList = new SumOfTwoList();
		Node n1 = new Node(3);
		n1.addNodeAtEnd(1);
		n1.addNodeAtEnd(5);

		Node n2 = new Node(5);
		n2.addNodeAtEnd(9);
		n2.addNodeAtEnd(2);
		n2.addNodeAtEnd(1);
		
		Node result = twoList.sum(n1, n2);
		while (result != null) {
			System.out.print(result.getData() + " ");
			result = result.next;
		}
	}
}
