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
    
    public void push(T value) {
        stackList.add(value);
    }
    
    public T pop() {
        if (isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }
    
	
	public String reverseString(String str) {
		String reversed = "";
		String letter;
		
		for (int i=0; i<str.length();i++){
			letter=Character.toString(str.charAt(i));
			this.push((T) letter);
		}
		
		while (isEmpty()==false) {
			reversed=reversed.concat(this.pop().toString());
		}
		
		return reversed;
	}
	
	public void sortStack(Stack<Integer> ints) {
		if (ints.size()<=1) return;

		Integer num = ints.pop();
		Stack<Integer> sorted = new Stack<Integer>();
		sorted.push(num);
		
		while (ints.isEmpty()==false) {
			num=ints.pop();
			if (num<=sorted.peek()) {
				sorted.push(num);				
			} else {
				for (int i=0;i<sorted.size() && num>sorted.peek();i++) {
					ints.push(sorted.pop());						
					
					if (sorted.isEmpty() || num<=sorted.peek()) {
						sorted.push(num);
					}
				}  
			}
		}
	}


}