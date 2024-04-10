package jayslabs.datastructures.hashtable;

import java.util.ArrayList;

public class HashTable {
	private int size;
	private Node[] datamap;
	
	public HashTable() {
		datamap = new Node[size];
	}

	public HashTable(int size) {
		this.size=size;
		datamap = new Node[size];
	}

    public void printTable() {
        for(int i = 0; i < datamap.length; i++) {
            System.out.println(i + ":");
            Node temp = datamap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }
    
    public int hash(String key) {
    	int hashed=0;
    	
    	char[] keyarr = key.toCharArray();
    	int ascii = 0;
    	
    	for (int i=0;i<keyarr.length;i++) {
    		ascii = keyarr[i];
    		hashed = (hashed + ascii * 31) % datamap.length;
    	}
    	
    	return hashed;
    }
    
    public void set(String key, int value) {
    	int idx = hash(key);
    	
    	Node node = new Node(key,value);
    	if (datamap[idx]==null) {
    		datamap[idx]=node;
    	} else {
    		Node ptr = datamap[idx];
    		while (ptr.next!=null)
    			ptr=ptr.next;
    		ptr.next=node;
    	}
    }
    
    public int get(String key) {
    	int idx = hash(key);
    	Node node = datamap[idx];
    	
    	if (node==null) return 0;
    	
    	if (node.next==null && node.key.equals(key))
    		return node.value;
    		
    	while (node!=null) {
    		if (node.key.equals(key)) {
        		return node.value;    			
    		} else {
    			node=node.next;    			
    		}
    	}
    	return 0;
    }
    
    public ArrayList keys() {
    	ArrayList<String> allkeys = new ArrayList<>();
    	
    	Node item=null;
    	for (int i=0;i<datamap.length;i++) {
    		item = datamap[i];
    		while (item!=null) {
    			allkeys.add(item.key);
    			item=item.next;
    		}
    	}
    	
    	return allkeys;
    }
}
