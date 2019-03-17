package com.java.linkedlist;

public class MainDuplicateNode {

	public static void main(String[] args) {
		Node n0 = new Node(0);
		n0.addNodeAtEnd(1);
		n0.addNodeAtEnd(2);
		n0.addNodeAtEnd(3);
		n0.addNodeAtEnd(4);
		n0.addNodeAtEnd(4);
		n0.addNodeAtEnd(6);
		n0.addNodeAtEnd(7);
		n0.addNodeAtEnd(8);
		n0.addNodeAtEnd(9);

		Node n = n0;
		while (n != null) {
			System.out.println(n.getData());
			n = n.next;
		}
		n0.removeDUplicate(n0);
		n = n0;
		while (n != null) {
			System.out.println(n.getData());
			n = n.next;
		}
	}
}