package com.java.tree;

import java.util.ArrayList;

import com.util.Node;

public class DFS {
	static ArrayList<Node> list=new ArrayList<>();
	static int max=0;
	public static void main(String[] args) {
		Node node1=new Node(2);
		Node node2=new Node(1);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node3.setRight(node5);
		
		DFS dfs=new DFS();
		dfs.DFSCalc(node1,1);
		System.out.println(" -> "+max);
		for(Node n:list) {
            if(2 == n.getData()){
                if(list.indexOf(n) < list.size())
                   System.out.println(list.get(list.indexOf(n)+1).getData());
            } 
		}
	}
	
	public void DFSCalc(Node root,int h) {
		if(root !=null) {
			if(root.getLeft() !=null || root.getRight()!=null)
				h++;
			DFSCalc(root.getLeft(),h);
			//System.out.println(root.getData());
			list.add(root);
			DFSCalc(root.getRight(),h);
			if(h>max) max=h;
		}
	}
}
