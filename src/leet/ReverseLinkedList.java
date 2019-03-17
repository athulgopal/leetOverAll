package leet;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		ListNode data = null;

		while (curr != null) {
			data = new ListNode(curr.val);
			data.next = prev;
			prev = data;
			curr = curr.next;
		}
		return data;
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		ListNode node = list.reverseList(node1);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
}
