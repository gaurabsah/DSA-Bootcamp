package LinkedList;

public class DoublyLinkedList {

	private ListNode head; // it will hold first node of DLL
	private ListNode tail; // it will hold last node of DLl
	private int length; // length of DLL -> returns no. of nodes

	private static class ListNode {
		private int data; // Generic type
		private ListNode previous;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

}
