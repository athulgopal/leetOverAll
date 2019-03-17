package com.java.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.util.Node;

public class BFS {
	
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
		
		BFS bfs=new BFS();
		bfs.BFSProcess(node1);
	}

	public void BFSProcess(Node root) {
		Queue<Node> nodes=new LinkedList<>();
		nodes.add(root);
		int height=0;
		while(!nodes.isEmpty()) {
			Node temp=nodes.remove();
			boolean isLeft=false;
			boolean isRight=false;
			System.out.println(temp.getData());
			if(temp.getLeft()!=null ) {
				nodes.add(temp.getLeft());
				isLeft=true;
			}
			if(temp.getRight()!=null) {
				nodes.add(temp.getRight());
				isRight=true;
			}
			if(isLeft|| isRight) height++;
		}
		
		System.out.println(height+1);
		
	}
}
