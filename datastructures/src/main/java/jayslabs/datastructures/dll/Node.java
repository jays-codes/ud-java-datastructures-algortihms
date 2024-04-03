package jayslabs.datastructures.dll;

public class Node {
	int value;
	Node next;
	Node prev;
	
	public Node(int value) {
		super();
		this.value=value;
		this.next=null;
		this.prev=null;
	}
	
	public int getValue() {
		return this.value;
	}
}
