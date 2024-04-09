package jayslabs.datastructures.tree;

import jayslabs.datastructures.tree.Node;

public class Node {

	Integer value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
