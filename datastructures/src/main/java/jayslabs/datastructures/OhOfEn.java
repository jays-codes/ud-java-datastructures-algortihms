package jayslabs.datastructures;

/**
 * Demoing O(n)
 *
 */
public class OhOfEn 
{
    public static void main( String[] args )
    {
    	//printItems(10);
    	int x = addItems(10);
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
