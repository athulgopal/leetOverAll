package com.util;

public class Node {

	int data;
	Node left;
	Node right;
	boolean isVIsited = false;

	public Node(int value) {
		this.data = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public boolean isVIsited() {
		return isVIsited;
	}

	public void setVIsited(boolean isVIsited) {
		this.isVIsited = isVIsited;
	}

}
