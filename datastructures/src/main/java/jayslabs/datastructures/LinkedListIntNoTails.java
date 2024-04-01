package jayslabs.datastructures;

public class LinkedListIntNoTails {
	private Node head;
	private int count;

	public LinkedListIntNoTails(int value) {
		super();
		this.head = new Node(value);
		count = 1;
	}

	public void append(int val) {
		Node pointer = new Node(val);
		getTail().next=pointer;
		//head.setNext(pointer);
		count++;
	}

	public void prepend(int val) {
		Node pointer = new Node(val);
		pointer.next=head;
		head = pointer;
		count++;
	}

	public boolean insert(int ix, int val) {
		Node newNode = new Node(val);
		Node pointer = head;

		if (ix > count)
			return false;

		for (int i = 0; i < ix - 1; i++) {
			pointer = pointer.next;
		}
		newNode.next=pointer.next;
		pointer.next=newNode;
		count++;
		return true;
	}

	public void removeLast() {
		if (count==0) return;
		if (count==1) {
			this.head=null;
			count=0;
			return;
		}
		Node pointer = head;
		Node tail = getTail();
		while (pointer.next!=tail) {
			pointer = pointer.next;
		}
		pointer.next=null;
		
		count--;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void printHead() {
		System.out.println("head:" + head.getValue());
	}

	public void printTail() {
		System.out.println("tail:" + getTail().getValue());
	}

	public Node getTail() {
		Node pointer = head;
		while (pointer.next!=null)
			pointer = pointer.next;
	
		return pointer;
	}

	public void printNodes() {
		if (count==0) {
			System.out.println("no nodes found");
			return;
		}

		Node pointer = head;
		System.out.println("count is:" + count + " ---------------");
		do {
			System.out.println(pointer.getValue());
			pointer = pointer.next;
		} while (pointer != null);

	}

	public void removeFirst() {
		if (count==0) {
			System.out.println("no nodes to remove");
			return;
		}
		if (count==1) {
			this.head=null;
			count=0;
			return;
		}
		Node newHead = head.next;
		head=null;
		head=newHead;
		count--;
	}

}
