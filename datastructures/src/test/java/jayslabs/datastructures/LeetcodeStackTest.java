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
	
}
