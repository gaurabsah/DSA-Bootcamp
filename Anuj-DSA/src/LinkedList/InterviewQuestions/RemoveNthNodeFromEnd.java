package LinkedList.InterviewQuestions;

public class RemoveNthNodeFromEnd {

	private ListNode head;

	private static class ListNode {
		private int data; // Generic type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// display the list
	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

//	Nth node from end
	public ListNode DeleteNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(n);
		start.next = head;
		ListNode fast = start;
		ListNode slow = start;

		for (int i = 1; i <= n; ++i)
			fast = fast.next;

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return start.next;
	}

	public static void main(String[] args) {
		RemoveNthNodeFromEnd sll = new RemoveNthNodeFromEnd();
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

//		now connect them together

		head.next = second; // 10 -> 1
		second.next = third; // 10 -> 1 -> 8
		third.next = forth; // 10 -> 1 -> 8 -> 11 -> null

		sll.display(head);

		sll.DeleteNthFromEnd(head, 2);

		sll.display(head);

	}

}
