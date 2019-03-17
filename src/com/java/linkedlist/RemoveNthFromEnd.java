package com.java.linkedlist;

import java.util.ArrayList;

import com.util.ListNode;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head != null && n > 0) {
			ArrayList<ListNode> list = new ArrayList<>();
			ListNode temp = head;
			while (temp != null) {
				list.add(temp);
				temp = temp.next;
			}
			if (list.get((list.size() - n)) != null) {
				temp = list.get((list.size() - n));
				if (temp.next != null) {
					temp.val = temp.next.val;
					temp.next = temp.next.next;
				} else {
					if((list.size() - n)>=1 && list.get((list.size() - n) -1) !=null) {
						temp=list.get((list.size() - n -1));
						temp.next = null;
					}else {
						head=null;
					}
				}
			}
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode listNode=new ListNode(1);
		//ListNode listNode2=new ListNode(2);
		//listNode.next=listNode2;
		RemoveNthFromEnd end=new RemoveNthFromEnd();
		end.removeNthFromEnd(listNode, 1);
	}
}
