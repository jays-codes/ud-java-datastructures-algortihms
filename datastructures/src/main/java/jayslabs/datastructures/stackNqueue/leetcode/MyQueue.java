package jayslabs.datastructures.stackNqueue.leetcode;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    
    public int peek() {
    	while (stack2.isEmpty()==false)
    		stack1.push(stack2.pop());
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

	public void enqueue(int i) {
		if (stack1.isEmpty()) {
			stack1.push(i);
			return;
		}
		
		while (stack1.isEmpty()==false)
			stack2.push(stack1.pop());
		stack2.push(i);
			
		while (stack2.isEmpty()==false)
				stack1.push(stack2.pop());
	}


	public Integer dequeue() {
		if (stack1.isEmpty()) return null;
		return stack1.pop();
	}			
}
