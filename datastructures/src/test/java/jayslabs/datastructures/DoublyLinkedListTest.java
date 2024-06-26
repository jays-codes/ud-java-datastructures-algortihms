package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jayslabs.datastructures.dll.DoublyLinkedList;
import jayslabs.datastructures.dll.Node;

public class DoublyLinkedListTest {

    /**
     * Append test
     */
	@Test
	public void testDLLAppend() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();
		assertTrue(true);
	}

    /**
     * Append test
     */
	@Test
	public void testDLLRemoveLast() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
//		dll.append(2);
//		dll.append(3);
//		dll.append(4);
//		dll.append(5);
//		dll.append(6);
//		dll.append(7);
		dll.printNodes();
//		Node removed=dll.removeLast();
//		removed=dll.removeLast();
		Node removed=dll.removeLast();
		dll.printNodes();
		assertTrue(removed.getValue()==1);
//		removed=dll.removeLast();
//		removed=dll.removeLast();
//		removed=dll.removeLast();
//		removed=dll.removeLast();
//		dll.printNodes();

	}
	
    /**
     * Prepend test
     */
	@Test
	public void testDLLprepend() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();
		dll.prepend(8);
		dll.prepend(9);
		dll.prepend(10);		
		dll.printNodes();
		assertTrue(true);
	}
	
    /**
     * RemoveFirst() test
     */
	@Test
	public void testDLLremoveFirst() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();
		dll.prepend(8);
		dll.prepend(9);
		dll.prepend(10);		
		dll.printNodes();
		Node removed=dll.removeFirst();
		removed=dll.removeFirst();
		removed=dll.removeFirst();
		removed=dll.removeFirst();
		dll.printNodes();
		removed=dll.removeFirst();
		removed=dll.removeFirst();		
		removed=dll.removeFirst();
		removed=dll.removeFirst();
		removed=dll.removeFirst();
		removed=dll.removeFirst();
		dll.printNodes();

		assertTrue(true);
	}
	
    /**
     * Get() test
     */
	@Test
	public void testDLLget() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();
		dll.prepend(8);
		dll.prepend(9);
		dll.prepend(10);		
		dll.printNodes();
		Node node = dll.get(7);
		System.out.println("val=" + node.getValue());
		assertTrue(node.getValue()==5);
	}

    /**
     * Set() test
     */
	@Test
	public void testDLLSet() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();
		dll.prepend(8);
		dll.prepend(9);
		dll.prepend(10);		
		dll.printNodes();
		assertTrue(dll.set(9,11));
		dll.printNodes();
	}
	
    /**
     * Insert() test
     */
	@Test
	public void testDLLInsert() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();
		dll.prepend(8);
		dll.prepend(9);
		dll.prepend(10);		
		dll.printNodes();
		assertTrue(dll.insert(8,12));
		dll.printNodes();
	}
	
    /**
     * Remove() test
     */
	@Test
	public void testDLLRemove() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();
		dll.prepend(8);
		dll.prepend(9);
		dll.prepend(10);		
		dll.printNodes();
		Node removed = dll.remove(7);
		assertTrue(removed.getValue()==5);
		System.out.println("val:" + removed.getValue());
		dll.printNodes();
	}
	
    /**
     * SwapFirstAndLast() test
     */
	@Test
	public void testDLLSwapFirstAndLast() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();
		dll.swapFirstAndLast();
		assertTrue(true);
		dll.printNodes();
	}
	
    /**
     * Reverse() test
     */
	@Test
	public void testDLLReverse() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);

		dll.printNodes();
		dll.reverse();
		assertTrue(true);
		dll.printNodes();
	}
	
    /**
     * ReverseXY() test
     */
	@Test
	public void testDLLReverseXY() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);

		dll.printNodes();
		Node nodeX = dll.get(0);
		System.out.println("nodeX.val=" + nodeX.getValue());
		
		Node nodeY = dll.get(5);
		System.out.println("nodeY.val=" + nodeY.getValue());
		//dll.reverseXY(nodeX, nodeY);		
		dll.reverseXYonce(nodeX, nodeY);
		dll.printNodes();
		assertTrue(true);
	}
	
    /**
     * isPalindrome() test
     */
	@Test
	public void testDLLIsPalindrome() {
		DoublyLinkedList dll = new DoublyLinkedList(0);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(9);
		dll.append(10);
		dll.append(9);
		dll.append(6);
		dll.append(5);
		dll.append(4);
		dll.append(3);
		dll.append(2);
		dll.append(0);
		dll.printNodes();		
		boolean isp = dll.isPalindrome();
		System.out.println(isp);
		assertTrue(isp);
	}
	
    /**
     * swapPairs() test
     */
	@Test
	public void testDLLSwapPairs() {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.append(6);
		dll.append(7);
		dll.printNodes();		
		dll.swapPairs();
		dll.printNodes();		
		assertTrue(true);
	}
}
