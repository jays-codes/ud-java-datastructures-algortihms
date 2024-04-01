package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple OhOfEn.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
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
}
