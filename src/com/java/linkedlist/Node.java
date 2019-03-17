package com.java.linkedlist;

public class Node {
	public Node next = null;
	private int data;

	public Node(int d) {
		data = d;
	}
	public int getData() {return this.data;}
	public void addNodeAtEnd(int d) {
		Node n = new Node(d);
		Node m = this;
		while (m.next != null)
			m = m.next;
		m.next = n;
	}

	public Node deleteNode(Node root, int d) {
		if (root.data == d)
			return root.next;
		Node n = root;
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				n.next = null;
				break;
			}
			n=n.next;
		}
		return root;
	}
	
	public void removeDUplicate(Node root) {
		while(root.next !=null) {
			int temp=root.data;
			Node n=root;
			while(n.next!=null) {
				if(n.next.data == temp) {
					n.next=n.next.next;
				}
				n=n.next;
			}
			root=root.next;
		}
	}
}
