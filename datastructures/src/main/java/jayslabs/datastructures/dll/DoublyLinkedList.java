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
			System.out.print(" - from head...");
			ptr=head;
			for (int i=0;i<idx;i++) {
				ptr=ptr.next;
			}
		} else {
			System.out.print(" - from tail...");
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

	public boolean insert(int ix, int val) {
		System.out.println("insert()");

		if (ix<0 || ix>length)
			return false;
		if (ix==length) {
			append(val);
			return true;
		}
		if (ix==0) {
			prepend(val);
			return true;
		}

		Node newNode = new Node(val);

		Node back = get(ix-1);
		Node front = back.next;
		
		back.next=newNode;
		newNode.prev=back;
		newNode.next=front;
		front.prev=newNode;
		
		length++;
		return true;
	}

	public Node remove(int ix) {
		System.out.println("remove()");

		if (ix<0 || ix>=length) {
			return null;
		}
		if (ix==0) {
			return removeFirst();
		} 
		if (ix==length-1) {
			return removeLast();
		}
		
//		Node remove = get(ix);
//		Node back = remove.prev;
//		Node front = remove.next;
//		
//		back.next=front;
//		front.prev=back;
//		remove.next=null;
//		remove.prev=null;
		
		//improve space complexity
		Node remove = get(ix);
		
		remove.prev.next=remove.next;
		remove.next.prev=remove.prev;
		remove.next=null;
		remove.prev=null;
		
		length--;
		return remove;
	}

	public void swapFirstAndLast() {
		if (length<2) return;

		int temp = head.value;
		head.value=tail.value;
		tail.value=temp;
	}

	public void reverse() {
		if (length<2) return;
		
		Node ptr=head;
		Node temp=null;
		
		while (ptr!=null) {
			temp=ptr.prev;
			ptr.prev=ptr.next;
			ptr.next=temp;
			ptr=ptr.prev;
		}
		
		ptr=head;
		head=tail;
		tail=ptr;
	}
	
	public void printNode(Node node) {
		System.out.print("Node:" + node.value);
	}
	
	public void printHead() {
		if (length==0) {
			System.out.println("count:" + length + "---------------");
			System.out.println("no head found");
			return;
		}
		System.out.println("head:" + head.getValue());
	}

	public void printTail() {
		if (length==0) {
			System.out.println("count:" + length + "---------------");
			System.out.println("no tail foundd");
			return;
		}
		System.out.println("tail:" + tail.getValue());
	}
	
}
