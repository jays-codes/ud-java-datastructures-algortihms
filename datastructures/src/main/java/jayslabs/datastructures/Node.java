package jayslabs.datastructures;

public class Node {
	public Node(int value) {
		super();
		this.value = value;
		this.next = null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	private int value;
	public Node next;
}
