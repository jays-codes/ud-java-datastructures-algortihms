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
	
	/**
     * test Stack reverse String()()
     */
	@Test
    public void testStackReverseStringA() {

        String myString = "hello";
        String reversedString = (new Stack()).reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */
    }
	
	/**
     * test Stack reverse String()()
     */
	@Test
    public void testStackReverseString() {

        String myString = "hello";
        String reversedString = (new Stack()).reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */
    }
	
	public String reverseString(String str) {
		String reversed = "";
		String letter;
		
		Stack myStack = new Stack();
		
		for (char c:str.toCharArray()) {
			myStack.push(c);
		}
		
//		for (int i=0; i<str.length();i++){
//			letter=Character.toString(str.charAt(i));
//			myStack.push(letter);
//		}
		
		while (myStack.isEmpty()==false) {
			reversed+=myStack.pop();
			//reversed=reversed.concat(myStack.pop().toString());
		}
		
		return reversed;
	}
}
