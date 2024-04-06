package jayslabs.datastructures.stackNqueue.leetcode;
import java.util.ArrayList;

public class Stack<T> {
    
    private ArrayList<T> stackList = new ArrayList<>();  
    
    public ArrayList<T> getStackList() {
        return stackList;
    }
    
    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }
    
    public boolean isEmpty() {
        return stackList.size() == 0;
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }
    
    public int size() {
        return stackList.size();
    }
    
	public void push(T node) {
		stackList.add(node);
	}    
	
	public T pop() {
		T node; 
		if (isEmpty()) {
			return null;
		} else {
			node=stackList.remove(stackList.size() - 1);
			return node;
		}
	}
}