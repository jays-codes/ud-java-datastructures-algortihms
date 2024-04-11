package jayslabs.datastructures.recursion;

public class Fibonacci {
	
	static int counter=0;
	
	public static void main(String[] args) {
		int num = 9;
		int fib = fibo(num);
		
		System.out.println("fibonacci " + num + ": " + fib);
		System.out.println("calls: " + counter);

	}
	
	public static int fibo(int n) {
		counter++;
		if (n==0 || n==1) return n;
		return fibo(n-1) + fibo(n-2);
	}
}
