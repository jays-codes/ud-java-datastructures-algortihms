package jayslabs.datastructures;

import java.util.LinkedList;

/**
 * Demoing O(n)
 *
 */
public class OhOfEn 
{
    public static void main( String[] args )
    {
    	
    	//LinkedListIntegers
    	//LinkedListIntNoTails
    	LinkedListIntegers ll 
    	= new LinkedListIntegers(40);
    	ll.printNodes();
    	ll.removeFirst();
    	ll.printNodes();
    	ll.prepend(1000);
    	ll.printNodes();
    	ll.append(23);
    	ll.append(76);   	
    	ll.append(99);
    	ll.append(11);
    	ll.append(3);
    	ll.append(4);
    	ll.append(28);
    	ll.printNodes();
    	ll.removeLast();
    	ll.printNodes();
    	ll.removeFirst();
    	ll.removeFirst();
    	ll.removeFirst();
    	ll.removeFirst();
    	ll.printNodes();
    	ll.removeLast();
    	ll.removeLast();
    	ll.printNodes();
    	ll.prepend(123);
    	ll.prepend(176);   	
    	ll.prepend(199);
    	ll.printNodes();
    	ll.insert(2, 777);
//    	ll.printNodes();
    	ll.insert(2, 778);
    	ll.insert(2, 779);
    	ll.printNodes();
    	ll.set(4,888);
    	ll.printNodes();
    	System.out.println("get:" + ll.get(5).getValue());
    	ll.remove(3);
    	ll.printNodes();
    	ll.reverse();
    	ll.printNodes();
    	
    	
    }
	
    //O(1)
    private static int addItems(int n) {
    	return n+n;
    }
	
	private static void printItems(int n) {
		for (int i=0;i<n;i++) {
			System.out.println(i);
		}
	}
	
	
}
