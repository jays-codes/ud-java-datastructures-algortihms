package jayslabs.datastructures.dll;

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
	
}
