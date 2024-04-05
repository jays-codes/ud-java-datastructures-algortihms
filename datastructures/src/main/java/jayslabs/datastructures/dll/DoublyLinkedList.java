package jayslabs.datastructures.dll;

import jayslabs.datastructures.dll.Node;

public class DoublyLinkedList {
	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

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

	public void reverseX() {
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

	public void swapPairs() {

		if (length<2) return;
	
		Node ptrMain = head;

		Node dummy = new Node(0);
		dummy.next=head;
		Node beforeNode=dummy;
		
		Node nodeX;
		Node nodeY;
		Node rnode=null;
		Node ptr=null;
		
		while (ptrMain!=null) {
			nodeX=ptrMain;
			nodeY=ptrMain.next;
			
			while (beforeNode.next!=nodeX) 
				beforeNode=beforeNode.next;
			
			if (nodeY!=null) {
				ptr = nodeY.next;					
			} else {
				rnode = reverseXY(nodeX,nodeY);
				beforeNode.next=rnode;
				rnode.prev=beforeNode;
				break;
			}
			
			//this is the key swapping part -  returned a reversed
			//detached node
			rnode = reverseXY(nodeX,nodeY);
			
			beforeNode.next=rnode;
			rnode.prev=beforeNode;
			while (rnode!=nodeX)
			rnode=rnode.next;
			
			//has a segment after node
			if (ptr!=null)	
				rnode.next=ptr;
			else //rnode is last segment
				rnode.next=null;
			
			ptrMain=ptrMain.next;			
		}
		head = dummy.next;
		head.prev=null;
	}
	
	
	public void reverse() {
		reverseXYonce(head, tail);
	}
	
	public Node reverseXY(Node nodeX, Node nodeY) {
		
		if (nodeY==null) {
			return nodeX;
		}
		
		if (nodeX.prev!=null)
			nodeX.prev.next=null;
		nodeX.prev=null;
		
		if (nodeY.next!=null)	
			nodeY.next.prev=null;
		nodeY.next=null;
		
		Node ptr = nodeX;	
		while (ptr!=null && ptr.prev!=nodeY) {
			swapNextandPrev(ptr);
			ptr=ptr.prev;
		}
		
		swapNodes(nodeX, nodeY); 
		return nodeY;
	}
	
	/**
	 * reverses nodes, and the pointers - DOES NOT SWAP END NODES
	 * version that does not use reverseXY(Node,Node):Node 
	 **/
//	public void reverseXYonce(Node nodeX, Node nodeY) {
//		if (length<2) return;
//		
//		Node dummy = new Node(0);
//		dummy.next=head;
//		Node beforeNode=dummy;
//		
//		while (beforeNode.next!=nodeX) 
//			beforeNode=beforeNode.next;
//		
//		Node ptr = beforeNode.next;	
//		while (ptr!=null && ptr.prev!=nodeY) {
//			swapNextandPrev(ptr);
//			ptr=ptr.prev;
//		}
//		
//		beforeNode.next=nodeY;
//		while (nodeY!=nodeX)
//		nodeY=nodeY.next;
//
//		if (ptr!=null) 
//			nodeY.next=ptr;
//		else
//			nodeY.next=null;
//
//		tail=nodeY;
//		head = dummy.next;
//	}
	
	/**
	 * reverses nodes, and the pointers - DOES NOT SWAP END NODES 
	 **/
	public void reverseXYonce(Node nodeX, Node nodeY) {
		if (length<2) return;
		
		Node dummy = new Node(0);
		dummy.next=head;
		Node beforeNode=dummy;
		
		while (beforeNode.next!=nodeX) 
			beforeNode=beforeNode.next;
		
		Node ptr = nodeY.next;	
		
		//this is the key swapping part -  returned a reversed
		//detached node
		Node rnode = reverseXY(nodeX,nodeY);
		
		beforeNode.next=rnode;
		while (rnode!=nodeX)
		rnode=rnode.next;

		//has a segment after node
		if (ptr!=null)	
			rnode.next=ptr;
		else //rnode is last segment
			rnode.next=null;

		tail=rnode;
		head = dummy.next;
	}
	
	private void swapNextandPrev(Node ptr) {
		Node temp=ptr.prev;
		ptr.prev=ptr.next;
		ptr.next=temp;
	}
	
	private void swapHeadTail() {
		Node ptr=head;
		head=tail;
		tail=ptr;
	}
	
	private void swapNodes(Node node1, Node node2) {
		Node temp=node1;
		node1=node2;
		node2=temp;
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

	public boolean isPalindrome() {
		System.out.println("isPalindrome()");
		if (length<=1) return true;
		
		Node hptr = head;
		Node tptr = tail;
		int i=0;
		while ((hptr!=tptr) && (hptr.prev!=tptr)) {
			if (hptr.getValue()!=tptr.getValue()) {
				System.out.println("iterations: " + i);
				return false;	
			}
			hptr=hptr.next;
			tptr=tptr.prev;
			i++;
		}
		System.out.println("iterations: " + i);
		return true;
	}
	
	 public boolean isPalindromeX() {
	        if (length <= 1) return true;
	        
	        Node forwardNode = head;
	        Node backwardNode = tail;
	        int x=0;
	        for (int i = 0; i < length / 2; i++) {
	            if (forwardNode.value != backwardNode.value) {
					System.out.println("iterations: " + i);
					return false;	
	            }
	            forwardNode = forwardNode.next;
	            backwardNode = backwardNode.prev;
	            x++;
	        }
			System.out.println("iterations: " + x);
	        return true;
	    }


	
}
