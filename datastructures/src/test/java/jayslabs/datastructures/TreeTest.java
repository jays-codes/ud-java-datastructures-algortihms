package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jayslabs.datastructures.tree.BST;
import jayslabs.datastructures.tree.Node;

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
		bst.printTree();

		assertTrue(true);
	}
	
    /**
     * test Tree contains() 
     */
	@Test
	public void testTreeContains() {
		
		
		BST bst = new BST();
		bst.insert(47);
		bst.insert(76);
		bst.insert(52);
		bst.insert(21);
		bst.insert(82);
		bst.insert(18);
		bst.insert(76);
		bst.insert(48);

		bst.printTree();

		Node node = new Node(52);
		System.out.println(node.getValue()+ " is present in BST: " + bst.contains(node.getValue()));
		bst.printTree();
		
		assertTrue(true);
	}
}
