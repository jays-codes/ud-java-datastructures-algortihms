package jayslabs.datastructures.stackNqueue;

public class Queue {
	private Node first;
	private Node last;
	private int length;
	
	public Queue(int value) {
		Node node= new Node(value);
		this.first=node;
		this.last=node;
		length=1;
	}
	
	public void printQueue(){
		if (first==null) return;
		Node ptr = first;
		
		while (ptr!=null) {
			System.out.println(ptr.getValue());
			ptr=ptr.next;
		}
	}
	
	public void enqueue(int val) {
		Node node=new Node(val);
		if (last==null) {
			first=node;
			last=node;
			length++;
			return;
		}
		
		last.next=node;		
		last=node;
		length++;
	}
	
	public Node dequeue() {
		if (first==null) return null;
		
		Node temp=first;
		if (length==1){
		    first=null;
		    last=null;
		} else {
		    first = first.next;
		    temp.next=null;
		}
		
		length--;
		return temp;
	}
	
	public Node getFirst() {
		return this.first;
	}
	
	public Node getLast() {
		return this.last;
	}
	
	
	
}
