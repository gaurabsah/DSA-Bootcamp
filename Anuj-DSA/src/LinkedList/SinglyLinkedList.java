package LinkedList;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data; // Generic type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

//	insert at beginning
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

//	insert at end
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}

//	insert at given position
	public void insertAtGivenPosition(int position, int value) {
		ListNode newNode = new ListNode(value);
		if (position == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
		}
	}

//	delete at first
	public ListNode deleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

//	delete at last
	public ListNode deleteLast() {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}

//	delete at given position
	public void deleteAtPosition(int position) {
		if (position == 1) {
			head = head.next;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}

// length of list
	public int lengthOfList() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
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

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
//		sll.head = new ListNode(10);
//		ListNode second = new ListNode(1);
//		ListNode third = new ListNode(8);
//		ListNode forth = new ListNode(11);

//		now connect them together

//		sll.head.next = second; // 10 -> 1
//		second.next = third; // 10 -> 1 -> 8
//		third.next = forth; // 10 -> 1 -> 8 -> 11 -> null

		sll.insertFirst(10);
		sll.insertFirst(1);
		sll.insertFirst(8);

		sll.insertLast(12);
		sll.insertLast(15);

		sll.insertAtGivenPosition(3, 333);
		sll.display();
		int length = sll.lengthOfList();
		System.out.println("Length of Linked List: " + length);

		sll.deleteFirst();
		sll.display();

		sll.deleteLast();
		sll.display();

		sll.deleteAtPosition(3);
		sll.display();
	}

}
