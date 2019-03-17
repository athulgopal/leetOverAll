package com.java.linkedlist;

import java.util.PriorityQueue;

import com.util.ListNode;

public class MergerSortedLists {
	public ListNode mergeKList(ListNode[] lists) {
		ListNode head=null;
		PriorityQueue<Integer> integers=new PriorityQueue<>();
		for(ListNode node:lists) {
			head=node;
			while(head !=null) {
				integers.add(head.val);
				head=head.next;
			}
		}
		ListNode temp;
		ListNode prev=null;
		for(int i=0;i<integers.size();i++) {
			temp=new ListNode(integers.poll());
			if(i==0)
				head=temp;
			if(prev!=null)
				prev.next=temp;
			prev=temp;
		}
		return head;
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode root=null;
		ListNode head=null;
		ListNode prev=null;
		boolean hasNext=(lists !=null && lists.length >0) ? true:false;
		ListNode temp=null;
		int nowValue=0;
		int len=lists.length;
		while(hasNext) {
			for(int i=0;i<lists.length;i++) {
				if(lists[i] ==null) {
					continue;
				}
				if(temp == null) {
					nowValue=i;
					temp=lists[i];
				}
				else {
					if(temp.val > lists[i].val) {
						temp=lists[i];
						nowValue=i;
					}
				}
			}
			
			lists[nowValue] =temp.next;
			head=new ListNode(temp.val);
			if(temp.next == null) len--;
			if(len ==0) hasNext=false;
			temp=null;
			if(prev !=null) 
				prev.next=head;
			else
				root=head;
				
			prev=head;
		}
		return root;
	}
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		listNode.next = listNode2;
		listNode3.next = listNode4;
		
		MergerSortedLists lists=new MergerSortedLists();
		lists.mergeKLists(new ListNode[] {});
	}
}
