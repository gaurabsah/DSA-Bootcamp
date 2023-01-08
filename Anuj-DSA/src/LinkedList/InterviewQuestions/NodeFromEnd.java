package LinkedList.InterviewQuestions;

public class NodeFromEnd {

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
	public ListNode NthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}

		if (n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " + n);
		}

		ListNode mainPtr = head;
		ListNode refPtr = head;

		int count = 0;

		while (count < n) {
			if (refPtr == null) {
				throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
			}
			refPtr = refPtr.next;
			count++;
		}

		while (refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}

	public static void main(String[] args) {
		NodeFromEnd sll = new NodeFromEnd();
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

//		now connect them together

		head.next = second; // 10 -> 1
		second.next = third; // 10 -> 1 -> 8
		third.next = forth; // 10 -> 1 -> 8 -> 11 -> null

		sll.display(head);

		System.out.println("Nth Node from End: " + sll.NthFromEnd(head, 2).data);

	}

}
