package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jayslabs.datastructures.stackNqueue.Node;
import jayslabs.datastructures.stackNqueue.Stack;

public class StackTest {
	
    /**
     * test Stack push()
     */
	@Test
	public void testStackPush() {
		Stack stack = new Stack(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.printStack();
		Node popped = stack.pop();
		popped = stack.pop();
		popped = stack.pop();
		popped = stack.pop();

		System.out.println("popped: " + popped.getValue());
		stack.printStack();
		System.out.println("top: " + stack.getTop().getValue());
		assertTrue(true);
	}
}
