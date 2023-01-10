package LinkedList.InterviewQuestions;

public class RemoveGivenKeyFromList {

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

	public void removeKeyFromList(ListNode head, int key) {
		ListNode current = head;
		ListNode temp = null;
		if (current != null && current.data == key) {
			head = current.next;
			return;
		}
		while (current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if (current == null) {
			return;
		}
		temp.next = current.next;
	}

	public static void main(String[] args) {
		RemoveGivenKeyFromList sll = new RemoveGivenKeyFromList();
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

//		now connect them together

		head.next = second; // 1 -> 4
		second.next = third; // 1 -> 4 -> 8
		third.next = forth; // 1 -> 4 -> 8 -> 11 -> null

		sll.display(head);
		sll.removeKeyFromList(head, 11);
		sll.display(head);

	}

}
