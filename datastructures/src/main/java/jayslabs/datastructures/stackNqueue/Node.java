package jayslabs.datastructures.stackNqueue;

public class Node {

	int value;
	Node next;

	public Node(int value) {
		super();
		this.value = value;
		this.next = null;
	}
	@Override
	public boolean equals(Object obj) {
		return ((Node)obj).value==this.value;
	}
//	public int getValue() {
//		return value;
//	}
//	public void setValue(int value) {
//		this.value = value;
//	}
	public int getValue() {
		return value;
	}
}
