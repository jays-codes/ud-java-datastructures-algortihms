package jayslabs.datastructures.dll;

import jayslabs.datastructures.dll.Node;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	public DoublyLinkedList(int value) {
		System.out.println("new()");
		Node newNode = new Node(value);
		this.head = newNode;
		this.tail = newNode;
		this.length=1;
	}
	
	public void append(int value) {
		System.out.println("append()");
		Node node = new Node(value);
		
		if (length==0) {
			this.head=node;
			this.tail=node;
		}
		if (length>0) {
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
		length++;
	}
	
	public Node removeLast() {
		System.out.println("removeLast()");
		if (length==0) return null;

		Node temp=tail;

		if (tail.prev==null) {
			tail=null;
			head=null;
		} else {
			tail = tail.prev;
			tail.next=null;
			temp.prev=null;		
		}
		
		length--;
		return temp;
	}
	
	public void printNodes() {
		if (length==0) {
			System.out.println("printNodes(): Empty");
			return;
		}
		Node ptr=head;
		do {
			System.out.print(" " + ptr.value);
			ptr=ptr.next;
		} while (ptr!=null);
		System.out.print("\n");

	}

	public void prepend(int value) {
		System.out.println("prepend()");
		Node node = new Node(value);
		
		if (length==0) {
			this.head=node;
			this.tail=node;
		}
		if (length>0) {
			head.prev=node;
			node.next=head;
			head=node;
		}
		length++;
	}
	
	public Node removeFirst() {
		System.out.println("removeFirst()");
		if (length==0) return null;

		Node temp=head;

		if (head.next==null) {
			tail=null;
			head=null;
		} else {
			head = head.next;
			head.prev=null;
			temp.next=null;		
		}
		
		length--;
		return temp;
	}
	
	public Node get(int idx) {
		System.out.println("get()");

		if (idx<0 || idx>=length) {
			System.out.println("invalid index specified.");
			return null;
		}
		
		int mid=length/2;
		
		Node ptr=null;
		if (idx<mid) {
			System.out.println("from head...");
			ptr=head;
			for (int i=0;i<idx;i++) {
				ptr=ptr.next;
			}
		} else {
			System.out.println("from tail...");
			ptr=tail;
			for (int i=length-1;i>idx;i--) {
				ptr=ptr.prev;
			}			
		}
		
		return ptr;
	}

	public boolean set(int ix, int val) {
		System.out.println("set()");

		if (length==0 || ix>=length) return false;
		
		Node update = get(ix);
		if (update==null) return false;
		update.value=val;
		return true;
	}
	
}
