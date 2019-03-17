package com.java.linkedlist;

import com.util.ListNode;

public class ReverseList {
	 public ListNode reverseList(ListNode head) {
		 ListNode current=head;
		 ListNode prev=null;
		 ListNode temp=null;
		 while(current!=null) {
			 temp=new ListNode(current.val);
			 temp.next=prev;
			 prev=temp;
			 current=current.next;
		 }
		 return temp;
	 }
	 public static void main(String[] args) {
		ReverseList list=new ReverseList();
		ListNode listNode=new ListNode(1);
		ListNode listNode2=new ListNode(2);
		ListNode listNode3=new ListNode(3);
		ListNode listNode4=new ListNode(4);
		listNode.next=listNode2;
		listNode2.next=listNode3;
		listNode3.next=listNode4;
		
		list.reverseList(listNode);
		
	}
}
