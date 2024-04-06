package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jayslabs.datastructures.stackNqueue.Node;
import jayslabs.datastructures.stackNqueue.Queue;
import jayslabs.datastructures.stackNqueue.Stack;

public class StackTest {
	
    /**
     * test Stack push() and pop()
     */
	@Test
	public void testStackPushandPop() {
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
	
    /**
     * test Queue enqueue and dequeue()
     */
	@Test
	public void testQueueEnqueueAndDequeue() {
		Queue q = new Queue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		q.enqueue(80);
		q.printQueue();
		
		Node popped = q.dequeue();
		popped = q.dequeue();
		popped = q.dequeue();
		popped = q.dequeue();

		System.out.println("dequeue: " + popped.getValue());
		q.printQueue();
		System.out.println("first in line: " + q.getFirst().getValue());
		assertTrue(true);
	}
}
