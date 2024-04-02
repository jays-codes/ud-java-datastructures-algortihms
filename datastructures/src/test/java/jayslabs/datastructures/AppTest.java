package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple OhOfEn.
 */
public class AppTest 
{
    /**
     * Test if LL has a loop
     */
    @Test
    public void testllHasLoop()
    {
		LinkedListIntegers ll = new LinkedListIntegers(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.append(6);
		ll.append(7);
		ll.getTail().next=ll.findMiddleNode();
		
        assertTrue( ll.hasLoop() );
    }
    
    /**
     * Find Kth from End in LL
     */
    @Test
    public void testllFindKthFromEnd()
    {
		LinkedListIntegers ll = new LinkedListIntegers(112);
		ll.append(452);
		ll.append(323);
		ll.append(894);
		ll.append(53);
		ll.append(61);
		ll.append(87);
		ll.printNodes();
		int ix=7;
		Node kth = ll.findKthFromEnd(7);
		System.out.println("kth[" + ix + "]:"+ kth.getValue());
        assertTrue( kth.getValue()==112 );
    }
    
    /**
     * PartitionList(x)
     */
    @Test
    public void testllPartitionList()
    {
		LinkedListIntegers ll = new LinkedListIntegers(11);
		ll.append(3);
		ll.append(8);
		ll.append(5);
		ll.append(10);
		ll.append(2);
		ll.append(1);
		ll.printNodes();
		int w=5;
		ll.partitionList(w);
		ll.printNodes();

        assertTrue(true);
    }
    
    /**
     * LL removeDuplicates()
     */
    @Test
    public void testLLRemoveDuplicates()
    {
		LinkedListIntegers ll = new LinkedListIntegers(11);
		ll.append(3);
		ll.append(8);
		ll.append(8);
		ll.append(3);
		ll.append(10);
		ll.append(10);
		ll.append(8);
		ll.append(11);
		ll.append(1);
		ll.printNodes();
		ll.removeDuplicates();
		ll.printNodes();

        assertTrue(true);
    }
    
    /**
     * LL: Binary to Dec()
     */
    @Test
    public void testLLBinaryToDec()
    {
		LinkedListIntegers ll = new LinkedListIntegers(1);
		ll.append(1);
		ll.append(0);
		ll.append(1);
		ll.append(1);
		ll.append(1);
		ll.printNodes();
		int decVal = ll.binaryToDecimal();
		System.out.println("decimal val:" + decVal);
        assertTrue(true);
    }
    
    /**
     * reverseBetween(x,y)
     */
    @Test
    public void testLLReverseBetween()
    {
		LinkedListIntegers ll = new LinkedListIntegers(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.append(6);
		ll.printNodes();
//		ll.reverse();
//		ll.printNodes();
		ll.reverseBetween(2,5);
		ll.printNodes();

        assertTrue(true);
    }
}
