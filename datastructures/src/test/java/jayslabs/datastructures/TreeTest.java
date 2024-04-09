package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jayslabs.datastructures.stackNqueue.Node;
import jayslabs.datastructures.stackNqueue.Stack;
import jayslabs.datastructures.tree.BST;

public class TreeTest {
    /**
     * test Tree insert() 
     */
	@Test
	public void testTreeInsert() {
		
		
		BST bst = new BST();
		bst.insert(47);
		bst.insert(76);
		bst.insert(52);
		bst.insert(21);
		bst.insert(82);
		bst.insert(18);
		bst.insert(76);
		
//		bst.insert(27);
//		bst.insert(48);
//		bst.insert(13);

		bst.printTree();

		assertTrue(true);
	}
}
