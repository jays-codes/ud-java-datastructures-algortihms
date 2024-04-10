package jayslabs.datastructures.hashtable;

public class HashTable {
	private int size;
	private Node[] datamap;
	
	public HashTable() {
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
}
