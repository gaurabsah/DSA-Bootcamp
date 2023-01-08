package LinkedList.InterviewQuestions;

public class FindMiddleNode {

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

//	find middle node
	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		return slowPtr;

	}

	public static void main(String[] args) {
		FindMiddleNode sll = new FindMiddleNode();
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

//		now connect them together

		head.next = second; // 10 -> 1
		second.next = third; // 10 -> 1 -> 8
		third.next = forth; // 10 -> 1 -> 8 -> 11 -> null

		sll.display(head);
		ListNode ans = sll.middleNode(head);
		System.out.println("Middle Node: " + ans.data);

	}

}
