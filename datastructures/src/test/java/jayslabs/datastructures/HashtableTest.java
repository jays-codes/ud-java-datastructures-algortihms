package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jayslabs.datastructures.hashtable.HashTable;

public class HashtableTest {
    /**
     * test Hashtable printTable() 
     */
	@Test
	public void testHashTablePrint() {
		
		HashTable ht = new HashTable();
		
		ht.printTable();

		assertTrue(true);
	}

    /**
     * test Hashtable has() 
     */
	@Test
	public void testHashTableHash() {
		
		HashTable ht = new HashTable(6);
		
		String key="magic7asdfasd";
		int hashed = ht.hash(key);
		System.out.println("hashed: " + hashed);
		assertTrue(true);
	}

	/**
     * test Hashtable set() 
     */
	@Test
	public void testHashTableSet() {
		
        HashTable myHashTable = new HashTable(6);

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("lumber0", 80);
        myHashTable.set("lumber1", 81);
        myHashTable.set("lumber2", 82);
        myHashTable.set("lumber3", 83);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();
        
        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
               {screws= 140}
            4:
               {bolts= 200}
            5:
            6:
               {nails= 100}
               {tile= 50}
               {lumber= 80}

        */

		assertTrue(true);
	}
	
	/**
     * test Hashtable get() 
     */
	@Test
	public void testHashTableGet() {
		
        HashTable ht = new HashTable(6);

        ht.set("nails", 100);
        ht.set("tile", 50);
        ht.set("lumber", 80);
        ht.set("lumber0", 80);
        ht.set("lumber1", 81);
        ht.set("lumber2", 82);
        ht.set("lumber3", 83);
        ht.set("bolts", 200);
        ht.set("screws", 140);
        ht.printTable();
        
        System.out.println("lumber2: " + ht.get("lumber2"));
		assertTrue(true);
	}
	
	/**
     * test Hashtable keys() 
     */
	@Test
	public void testHashTableKeys() {
		
        HashTable ht = new HashTable(6);

        ht.set("nails", 100);
        ht.set("tile", 50);
        ht.set("lumber", 80);
        ht.set("lumber0", 80);
        ht.set("lumber1", 81);
        ht.set("lumber2", 82);
        ht.set("lumber3", 83);
        ht.set("bolts", 200);
        ht.set("screws", 140);
        ht.printTable();
        
        System.out.println("keys:" + ht.keys());
		assertTrue(true);
	}

}
