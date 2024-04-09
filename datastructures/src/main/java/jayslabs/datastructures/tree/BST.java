package jayslabs.datastructures.tree;

public class BST {
	Node root;

//	//recursive solution
	public void insertIterative(Integer i) {
		Node node = new Node(i);
		if (root==null) {
			root=node;
			return;
		}
		
		findSpot(root, node);
	}
	
	private void findSpot(Node parent, Node node) {
		if (parent.value==node.value) return;
		if (node.value>parent.value) {
			if (parent.right==null) {
				parent.right=node;
				return;
			} else {
				findSpot(parent.right, node);
			}
		} else {
			if (parent.left==null) {
				parent.left=node;
				return;
			} else {
				findSpot(parent.left, node);
			}
		}
	}
//	//end of recursive solution
	
	//iterative  solution - X
	//TODO: modify as per toans solution - Section14, coding exercise 45 Q&A
	public void insert(Integer i) {
		Node node = new Node(i);
		if (root==null) {
			root=node;
			return;
		}
		
		if (root.value==node.value) return;
		
		Node parent = root;

		if (node.value<parent.value) {
			traverseLeft(parent,node);
		} else {
			traverseRight(parent,node);
		} 
	}
	
	public void traverseLeft(Node parent, Node node) {
		while (parent.left!=null) {
			parent=parent.left;
			if (parent.value==node.value) return;
			if (node.value<parent.value) {
				if (parent.left==null) {
					parent.left=node;
					return;						
				} 
			} else {
				traverseRight(parent,node);
				return;
			} 
		}
		parent.left=node;
		return;		
	}

	public void traverseRight(Node parent, Node node) {
		while (parent.right!=null) {
			parent=parent.right;
			if (parent.value==node.value) return;
			if (node.value>parent.value) {
				if (parent.right==null) {
					parent.right=node;
					return;						
				} 
			} else {
				traverseLeft(parent,node);
				return;
			} 
		}
		parent.right=node;
		return;		
	}

	
	public void printTree() {
		printNode("",root, 0);
	}
	
	private void printNode(String direc, Node node, int parent) {
		if (direc=="l")
			System.out.println(node.value + "<---[" + parent+"]");
		else if (direc=="r")
			System.out.println("["+parent + "]--->" + node.value);
		else 
			System.out.println("ROOT: [" + node.value+ "]");
			
		if (node.left!=null) {
			printNode("l",node.left, node.value);
		} 
		
		if (node.right!=null) {
			printNode("r",node.right, node.value);
		} 
	}
}
