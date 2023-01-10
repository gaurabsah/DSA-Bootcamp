package LinkedList.InterviewQuestions;

public class InsertNodeInSortedSLL {

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

//	Insert Node in Sorted SLL
	public ListNode insertNodeInSortedList(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		while (current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}

	public static void main(String[] args) {
		InsertNodeInSortedSLL sll = new InsertNodeInSortedSLL();
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

//		now connect them together

		head.next = second; // 1 -> 4
		second.next = third; // 1 -> 4 -> 8
		third.next = forth; // 1 -> 4 -> 8 -> 11 -> null

		sll.display(head);
		sll.insertNodeInSortedList(head, 5);
		sll.display(head);

	}

}
