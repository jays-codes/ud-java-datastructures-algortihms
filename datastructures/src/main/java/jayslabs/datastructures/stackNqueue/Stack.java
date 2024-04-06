package jayslabs.datastructures.stackNqueue;

public class Stack {
	private Node top;
	private int height;
	
	public Stack(int value) {
		Node newNode = new Node(value);
		this.top=newNode;
		this.height=1;
				
	}
	
	public void printStack() {
		Node temp=top;
		while (temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void push(int val) {
		Node node = new Node(val);
		node.next=top;
		top=node;
		height++;
	}
	
	public Node pop() {
		if (top==null) return null;
		Node temp=top;
		top=top.next;
		height--;
		return temp;
	}
	
	
	public Node getTop() {
		return this.top;
	}
}
