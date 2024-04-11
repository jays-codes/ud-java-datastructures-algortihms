package jayslabs.datastructures.recursion;

public class MakeChange {

	public static void main(String[] args) {
		double bill = .79;
		double[] denom = {.50,.25,.10,.05,.01};
		

		int[] coins = makeChange(bill, denom);
	
		System.out.println("50c: " + coins[0]);
		System.out.println("25c: " + coins[1]);
		System.out.println("10c: " + coins[2]);
		System.out.println("5c: " + coins[3]);
		System.out.println("1c: " + coins[4]);

	}

	public static int[] makeChange(double bill, double[] denom) {
		//HashMap<Double, Integer> coins = new HashMap<>();
		
		int[] coin = new int[denom.length];
		
		for (int i=0;i<denom.length;i++) {
			if (bill>=denom[i]) {
				coin[i]=(int) (bill/denom[i]);	
				bill=bill%denom[i];
			} 
		}

		return coin;
	}
	
	

}
