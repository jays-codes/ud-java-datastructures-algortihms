package jayslabs.datastructures;

import org.junit.Test;

import jayslabs.datastructures.stackNqueue.leetcode.Stack;

public class LeetcodeStackTest {

	
    /**
     * test Stack push()()
     */
	@Test
    public void testStackPush() {

        Stack myStack = new Stack();
        
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.printStack();
        
        /*
            EXPECTED OUTPUT:
			3
			2
			1

        */
    }

	/**
     * test Stack pop()()
     */
	@Test
    public void testStackPop() {

        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        
        System.out.println("Stack before pop():");
        myStack.printStack();
        
        System.out.println("\nPopped node:");
        System.out.println(myStack.pop());
        
        System.out.println("\nStack after pop():");
        myStack.printStack();
 
        /*
            EXPECTED OUTPUT:
            Stack before pop():
            3
            2
            1
            
            Popped node:
            3
            
            Stack after pop():
            2
            1

        */
    }
	
}
