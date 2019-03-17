package com.java.tree;

import com.util.Node;

public class PerfectSubtree {
	static boolean isStart=false;
	boolean isSubTree(Node t,Node s) {
		if(t== null && s==null) return true;
		if(s==null) return true;
		if(isStart && t==null) return false;
		else if(!isStart && t==null) return true;
		System.out.println(t.getData()+" "+s.getData());
		if(isStart && s!=null && t.getData()!= s.getData()) return false;
		if(!isStart && (t.getData() ==s.getData())) isStart=true;
		if(isStart) 
			return isSubTree(t.getLeft(), s.getLeft()) && isSubTree(t.getRight(), s.getRight());
		else
			return isSubTree(t.getLeft(), s) && isSubTree(t.getRight(), s);
	}
	public static void main(String[] args) {
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node3.setRight(node5);
		
		
		
		Node node11=new Node(10);
		Node node12=new Node(20);
		Node node13=new Node(30);
		Node node14=new Node(40);
		Node node15=new Node(50);
		node11.setLeft(node12);
		node11.setRight(node13);
		node12.setLeft(node14);
		node13.setRight(node15);
		
		PerfectSubtree perfectSubtree=new PerfectSubtree();
		System.out.println((perfectSubtree.isSubTree(node1, node13))&& isStart);
		
	}
}
