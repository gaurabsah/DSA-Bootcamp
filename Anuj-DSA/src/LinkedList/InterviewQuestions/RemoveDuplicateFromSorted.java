package LinkedList.InterviewQuestions;

public class RemoveDuplicateFromSorted {

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

//	Remove Duplicate node from sorted SLL
	public ListNode removeDuplicate(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		RemoveDuplicateFromSorted sll = new RemoveDuplicateFromSorted();
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(2);
		ListNode forth = new ListNode(3);
		ListNode fifth = new ListNode(3);

//		now connect them together

		head.next = second; // 1 -> 1
		second.next = third; // 1 -> 1 -> 2
		third.next = forth; // 1 -> 1 -> 2 -> 3
		forth.next = fifth; // 1 -> 1 -> 2 -> 3 -> 3 -> null

		sll.display(head);

		sll.removeDuplicate(head);
		sll.display(head);

	}

}
