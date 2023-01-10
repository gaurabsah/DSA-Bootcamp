package LinkedList.InterviewQuestions;

public class FindStartNodeOfLoop {

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

//	check if given linked list contains loop
	public ListNode hasCycle() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr) {
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}

//	get the starting node of loop
	public ListNode getStartingNode(ListNode slowPtr) {
		ListNode temp = head;
		while (slowPtr != temp) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
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
		FindStartNodeOfLoop sll = new FindStartNodeOfLoop();
		sll.createLoopLinkedList();
		int result = sll.hasCycle().data;
		System.out.println("Loop Started at node: " + result);
	}

}
