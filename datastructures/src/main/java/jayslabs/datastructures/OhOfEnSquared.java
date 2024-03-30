package jayslabs.datastructures;

public class OhOfEnSquared {

	public static void main(String[] args) {
		printItems2(10);

	}

	private static void printItems(int n) {
		for (int i=0;i<n;i++) {
			for (int j=0; j<n; j++) {
				System.out.println(i + ":" +j);				
			}
		}
		
	}

	//O(n^2) + O(n). non dominants
	private static void printItems2(int n) {
		for (int i=0;i<n;i++) {
			for (int j=0; j<n; j++) {
				System.out.println(i + ":" +j);				
			}
		}
		
		for (int k=0;k<n;k++) {
			System.out.println(k);
		}
		
	}
}
