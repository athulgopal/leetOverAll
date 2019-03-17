package leet;

public class SumOfLinkedList {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l = null;
		ListNode root=null;
		int l1Val=0;
		int l2Val=0;
		int carry = 0;
		while (l1 != null || l2 != null) {
			if(l1!=null)l1Val=l1.val;
			else l1Val=0;
			if(l2!=null) l2Val=l2.val;
			else l2Val=0;
			int sum = l1Val + l2Val + carry;
			if (sum >= 10) {
				carry = sum / 10;
				sum = sum % 10;
			} else {
				carry = 0;
			}
			if (l == null) {
				l = new ListNode(sum);
				root=l;
			}
			else {
				ListNode temp = new ListNode(sum);
				l.next = temp;
				l = l.next;
			}
			if(l1 !=null )
				l1 = l1.next;
			if(l2 !=null)
				l2 = l2.next;
		}
		if(carry >0) {
			ListNode temp = new ListNode(carry);
			l.next = temp;
		}
		return root;
	}
	public static void main(String[] args) {
		SumOfLinkedList list=new SumOfLinkedList();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(8);
		/*ListNode node3 = new ListNode(3);*/
		ListNode node4 = new ListNode(0);
		/*ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);*/
		node1.next=node2;
		/*node2.next=node3;
		node4.next=node5;
		node5.next=node6;
		*/
		ListNode node=list.addTwoNumbers(node1, node4);
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
	}
}
