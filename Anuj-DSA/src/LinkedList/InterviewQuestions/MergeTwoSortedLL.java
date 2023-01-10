package LinkedList.InterviewQuestions;

public class MergeTwoSortedLL {

	private static ListNode head;
	private static ListNode tail;

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

	public void display1() {
		ListNode previous = tail;
		while (previous != null) {
			System.out.print(previous.data + " --> ");
			previous = previous.next;
		}
		System.out.println("null");
	}

	public void createLoopLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);

//		now connect them together
		head = first;
		first.next = second;
		second.next = third;
	}

	public void createLinkedList() {
		ListNode a = new ListNode(4);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(6);

//		now connect them together
		tail = a;
		a.next = b;
		b.next = c;
	}

// merge two sorted linked list
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (list1 != null && list2 != null) {
			if (list1.data <= list2.data) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}
		if (list1 == null) {
			tail.next = list2;
		} else {
			tail.next = list1;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		MergeTwoSortedLL sll = new MergeTwoSortedLL();
		sll.createLoopLinkedList();
		sll.display();
		sll.createLinkedList();
		sll.display1();
		sll.mergeTwoLists(head, tail);
		sll.display();
	}

}
