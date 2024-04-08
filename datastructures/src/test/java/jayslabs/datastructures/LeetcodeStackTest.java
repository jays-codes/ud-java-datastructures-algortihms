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
	
	/**
     * test Stack isBalancedParenthesis()()
     */
	@Test
    public void testStackIsBalancedParenthesis() {

        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }	

	Stack<Integer> stack;	
	
	/**
     * test Stack sorting
     */
	@Test
    public void testStackSorting() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);
      
        System.out.println("Before sorting:");
        stack.printStack();

        stack=sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */
    }	
	
	public Stack<Integer> sortStack2(Stack<Integer> ints) {
		if (ints.size()<=1) return null;

		Stack<Integer> sorted = new Stack<Integer>();
		sorted.push(ints.pop());
		
		Integer num;
		while (ints.isEmpty()==false) {
			
			if (ints.peek()<=sorted.peek()) {
				sorted.push(ints.pop());				
			} else {
				num=ints.pop();
				while (sorted.isEmpty()==false && num>sorted.peek()) {
					ints.push(sorted.pop());
				}
				sorted.push(num);				
			}
		}
		return sorted;
	}
	
	public Stack<Integer> sortStack(Stack<Integer> ints) {
		if (ints.size()<=1) return null;

		Stack<Integer> sorted = new Stack<Integer>();
		sorted.push(ints.pop());
		
		Integer num;
		while (ints.isEmpty()==false) {
			
			if (ints.peek()<=sorted.peek()) {
				sorted.push(ints.pop());				
			} else {
				num=ints.pop();
				while (sorted.isEmpty()==false && num>sorted.peek()) {
					ints.push(sorted.pop());
				}
				sorted.push(num);				
			}
		}
		return sorted;
	}	
	
	
    public void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
    	
        boolean result = isBalancedParentheses(testStr);
        
        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);
        
        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }
        
        // Print a separator for better readability
        System.out.println("--------------");
    }	

    
    
	public String reverseString(String str) {
		String reversed = "";
		
		Stack<Character> myStack = new Stack<Character>();
		
		for (char c:str.toCharArray()) {
			myStack.push(c);
		}
		
		
		while (myStack.isEmpty()==false) {
			reversed+=myStack.pop();
		}
		
		return reversed;
	}
	
	public boolean isBalancedParentheses(String testStr) {
		if (testStr.isEmpty()) return true;
		if (testStr.length()<=1) return false;
		
		boolean balanced = false;
		Stack<Character> open = new Stack<Character>();
		
		char openCh='(';
		char closedCh = ')';
		for (char c:testStr.toCharArray()) {
			if (c==openCh) {
				open.push(c);
				balanced=false;
			} else if (c==closedCh) {
				if (open.isEmpty()) return false;
				if (((Character) open.peek()).charValue()==openCh) {
					open.pop();
					balanced=true;
				} 
			}
		}
		if (open.isEmpty()!=true) balanced = false;
		
		return balanced;
	}	
}
