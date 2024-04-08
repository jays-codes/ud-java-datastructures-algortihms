package jayslabs.datastructures.tree;

import jayslabs.datastructures.tree.Node;

public class Node {

	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
