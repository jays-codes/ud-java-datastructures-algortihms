package jayslabs.datastructures.leetcode;

import jayslabs.datastructures.LinkedListIntegers;
import jayslabs.datastructures.Node;

public class LeetCodeMain {
	
	public static void main(String[] args) {
		LinkedListIntegers ll = new LinkedListIntegers(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.append(6);
		ll.append(7);
		ll.printNodes();
		Node middle = ll.findMiddleNode();
		System.out.println("middle is: " + middle.getValue());
		
		ll.append(8);
		ll.printNodes();
		middle = ll.findMiddleNode();
		System.out.println("middle is: " + middle.getValue());
		
		
	}
}
