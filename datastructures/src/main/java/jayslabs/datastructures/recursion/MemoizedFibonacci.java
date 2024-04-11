package jayslabs.datastructures.recursion;

public class MemoizedFibonacci {

	static int counter=0;
	static Integer[] memo = new Integer[100];
	
	public static void main(String[] args) {
		int num = 40;
		int fib = fibo(num);
		
		System.out.println("fibonacci " + num + ": " + fib);
		System.out.println("calls: " + counter);

	}

	public static int fibo(int n) {
		counter++;
		
		if (memo[n]!=null) return memo[n];
		
		if (n==0 || n==1) return n;
		
		
		memo[n]= fibo(n-1) + fibo(n-2);
		return memo[n];
	}
}
