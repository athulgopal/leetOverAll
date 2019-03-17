package com.java.linkedlist;

import java.util.ArrayList;

import com.util.ListNode;

public class Paliandrome {
	public boolean isPalindrome(ListNode head) {
		ArrayList<ListNode> arrayList=new ArrayList<>();
		if (head == null)
			return true;
		ListNode end=head;
		while (end!= null) {
			arrayList.add(end);
			end=end.next;
		}
		int i=arrayList.size();
		end =arrayList.get(i-1);
		while(end !=head) {
			if(end.val !=head.val) return false;
			head=head.next;
            i--;
            if(i > arrayList.size()/2)
                end =arrayList.get(i-1);
		}
		return true;
	}

	public static void main(String[] args) {
		Paliandrome paliandrome=new Paliandrome();
		ListNode listNode = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(2);
		ListNode listNode4 = new ListNode(1);
		listNode.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		
		System.out.println(paliandrome.isPalindrome(listNode));
	}
}
