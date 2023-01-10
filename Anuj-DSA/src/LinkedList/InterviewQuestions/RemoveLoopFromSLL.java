package LinkedList.InterviewQuestions;

public class RemoveLoopFromSLL {

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
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

//	check if given linked list contains loop
	public void hasCycle() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr) {
				removeLoop(slowPtr);
				return;
			}
		}
	}

//	remove the loop
	public void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		while (slowPtr.next != temp.next) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
	}

	public void createLoopLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

//		now connect them together
		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = second;
	}

	public static void main(String[] args) {
		RemoveLoopFromSLL sll = new RemoveLoopFromSLL();
		sll.createLoopLinkedList();

		sll.hasCycle();
		sll.display();
	}

}
