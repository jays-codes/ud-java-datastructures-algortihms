package jayslabs.datastructures;

import java.util.HashSet;
import java.util.Set;

public class LinkedListIntegers {
	private Node head;
	private Node tail;
	private int count;

	public LinkedListIntegers(int value) {
		super();
		this.head = new Node(value);
		this.tail = head;
		count = 1;
	}

	public void append(int val) {
		Node newNode = new Node(val);
		
		if (count==0) {
			this.head=newNode;
			this.tail=newNode;
		}
		if (count>0) {
			tail.next=newNode;
			this.tail=newNode;
		}
		count++;
	}

	public void prepend(int val) {
		Node pointer = new Node(val);

		if (count==0) {
			this.head = pointer;
			this.tail = pointer;
		}
		
		if (count>0) {
			pointer.next=head;
			this.head=pointer;			
		}
		count++;
	}

	public Node get(int ix) {
		if (ix<0 || ix>count) {
			System.out.println("invalid index specified.");
			System.exit(1);
		}
		Node pointer = this.head;
		for (int i=0;i<ix;i++) {
			pointer=pointer.next;
		}
		return pointer;
	}	

	public boolean set(int ix, int val) {
		Node update = get(ix);
		if (update==null) return false;
		update.setValue(val);
		return true;
	}	
	
	
	public boolean insert(int ix, int val) {
		//Node pointer = head;

		if (ix<0)
			return false;
		if (ix>=count) {
			append(val);
			return true;
		}
		if (ix<=0) {
			prepend(val);
			return true;
		}

		Node newNode = new Node(val);
		
//		Node pointer = get(ix-1);
//		Node attacher = get(ix);
//		pointer.setNext(newNode);
//		newNode.setNext(attacher);
		
		Node pointer = get(ix-1);

		newNode.next=pointer.next;
		pointer.next=newNode;
		
		count++;
		return true;
	}

	public Node remove(int ix) {
		if (ix<0) {
			return null;
		}
		if (ix==0) {
			return removeFirst();
		} 
		if (ix==count-1) {
			return removeLast();
		}
		
		Node remove = get(ix);
		get(ix-1).next=remove.next;
		remove.next=null;
		count--;
		return remove;
	}

	
	public Node removeLast() {
		Node remove = get(count-1);
		if (count==0) return null;
		if (count==1) {
			this.head=null;
			this.tail=null;
			count=0;
			return remove;
		}
		Node pointer = head;
		while (pointer.next != tail) {
			pointer = pointer.next;
		}
		pointer.next=null;
		this.tail=pointer;
		count--;
		return remove;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public void printHead() {
		if (count==0) {
			System.out.println("count:" + count + "---------------");
			System.out.println("no head found");
			return;
		}
		System.out.println("head:" + head.getValue());
	}

	public void printTail() {
		if (count==0) {
			System.out.println("count:" + count + "---------------");
			System.out.println("no tail foundd");
			return;
		}
		System.out.println("tail:" + tail.getValue());
	}



	public Node removeFirst() {
		if (count==0) {
			System.out.print("called remove1st()--no nodes found");
			return null;
		}

		Node tmp = head;

		head = head.next;
		tmp.next=null;
		count--;
		if (count==0) this.tail=null;

		System.out.println("remove1st()--removed:" + tmp.getValue());		
		return tmp;
		
	}

	public void reverse() {
//		Node back = null;
//		Node current = head;
//		Node front = null;
//		
//		while(current!=null) {
//			front = current.next;
//			current.next = back;
//			back = current;
//			current=front;
//		}
//		
//		head=tail;
		
        Node temp = head;
        head=tail;
        tail=temp;
        
        Node after=temp.next;
        Node before = null;
        
        for (int i=0;i<count;i++){
            after = temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }	
	}
	
	public void printNodes() {
		if (count==0) {
			System.out.println("printNodes()--no nodes found");
			return;
		}

		Node pointer = head;
		System.out.println("printNodes()--count:" + count + "---------------");
		do {
			System.out.println(pointer.getValue());
			pointer = pointer.next;
		} while (pointer != null);

	}

	public Node findMiddleNode() {
		Node slowptr = head;
		Node fastptr = head;
		
		while (fastptr!=null) {
			if (fastptr==tail) {
				return slowptr;
			} else {
				slowptr=slowptr.next;
				fastptr=fastptr.next.next;
			}
		} 
		return slowptr;
	}

	public boolean hasLoop() {
		Node slow = head;
		Node fast = head;
		
		//no loop if only one element
		if (slow==tail) return false;
		
		while (fast!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if (slow==fast) return true;
		}
		
		return false;
	}

	public Node findKthFromEnd(int kth) {
		
		Node aha = head;
		Node endpt = head;
		
        if (aha==null) return null;
        
        if (kth==1 && aha.next==null) return aha;
		
		for (int i=0;i<kth;i++) {
			endpt=endpt.next;
		}		
		
		while (endpt!=null) {
			aha=aha.next;
			endpt=endpt.next;
		}
		
		return aha;
	}

	public void partitionList(int w) {
		if (head==null) return;
		
		Node curr=head;

		Node lthead=new Node(0);
		Node gthead=new Node(0);

		Node lt=lthead;
		Node gt=gthead;
		
		while (curr!=null) {
			if (curr.getValue()<w) {				
				lt.next=curr;
				lt=lt.next;				
			} else {
				gt.next=curr;
				gt=gt.next;
			}
			curr=curr.next;
		}
		
		gt.next=null;
		
		lt.next=gthead.next;
		head=lthead.next;
	}

	public void removeDuplicates() {
		Set<Integer> values = new HashSet<Integer>();
		Node curr=head;
		Node prev=null;
		
		while (curr!=null) {
			if (values.contains(curr.getValue())){
				prev.next=curr.next;
				count--;
			} else {
				values.add(curr.getValue());
				prev=curr;
			}
			curr=curr.next;
		}
		
}

	public int binaryToDecimal() {
		int sum=0;

		Node curr=head;
		while (curr!=null) {
			sum=sum*2;
			sum = sum + curr.getValue();
			curr=curr.next;
		}
		return sum;
	}	





}
