package LinkedList.InterviewQuestions;

public class SearchElement {

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

//	search an element
	public boolean search(ListNode head, int searchKey) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		while (current != null) {
			if (current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public static void main(String[] args) {
		SearchElement sll = new SearchElement();
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

//		now connect them together

		head.next = second; // 10 -> 1
		second.next = third; // 10 -> 1 -> 8
		third.next = forth; // 10 -> 1 -> 8 -> 11 -> null

		sll.display(head);

		if (sll.search(head, 11)) {
			System.out.println("Search Key Found");
		} else {
			System.out.println("Search Key Not Found");
		}
	}

}
