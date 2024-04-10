package jayslabs.datastructures;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
	
	/**
     * test Hashtable itemInCommon 
     */
	@Test
	public void testHashTableItemsInCommon() {
		
		int[] arr1 = {1,4,67,3,65,90};
		int[] arr2 = {7,5,9,23,43,21,67};
		
		boolean matchedpair = itemsInCommon(arr1, arr2);
		
		assertTrue(matchedpair);
	}
	
	/**
     * test Hashtable findDuplicates 
     */
	@Test
	public void testHashTableFindDuplicates() {
		
		int[] arr1 = {1,4,67,3,65,90,7,5,9,90,90,90,23,43,21,67};
		
		List<Integer> dups = findDuplicates(arr1);
		
		System.out.println(dups);
		assertTrue(true);
	}	
	
	/**
     * test Hashtable firstNonRepeatingCharacter 
     */
	@Test
	public void testHashTablefirstNonRepeatingCharacter() {
		
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
		
		assertTrue(true);
	}	
	
	public Character firstNonRepeatingChar(String str) {
		
		if (str.isEmpty()) return null;
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		for (char ch:str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		
		for (char key : hm.keySet()) {
			if (hm.get(key)==1) {
				return key;
			}
		}
		return null;
	}

	public List<Integer> findDuplicates(int[] arr){
		List<Integer> dups = new ArrayList<>();
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i:arr) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue()>1) {
				dups.add(entry.getKey());
			}
		}
		return dups;
	}
	
	
	public List<Integer> findDuplicatesX(int[] arr){
		List<Integer> dups = new ArrayList<>();
		
		HashMap<Integer, Boolean> hm = new HashMap<>();
		
		for (int i:arr) {
			if (hm.get(i)==null) {
				hm.put(i, true);
			} else {
				if (dups.contains(i)==false)
				dups.add(i);
			}
		}
		
		return dups;
	}
	
	public boolean itemsInCommon(int[] ar1, int[] ar2) {
		HashMap<Integer, Boolean> hm = new HashMap<>();
		
		for (int i:ar1) {
			hm.put(i, true);
		}
		for (int j:ar2) {
			if (hm.get(j)!=null) return true;
		}
		return false;
	}
}
