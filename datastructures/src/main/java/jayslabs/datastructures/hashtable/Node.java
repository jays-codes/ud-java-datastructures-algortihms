package jayslabs.datastructures.hashtable;

import jayslabs.datastructures.hashtable.Node;

public class Node {

	String key;
	int value;
	Node next;

	public Node(String key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
