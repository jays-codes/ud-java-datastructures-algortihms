package jayslabs.datastructures.recursion;

public class BottomUpFibonacci {

	static int counter=0;
	static Integer[] memo = new Integer[100];
	
	public static void main(String[] args) {
		int num = 40;
		int fib = fibo(num);
		
		System.out.println("fibonacci " + num + ": " + fib);
		System.out.println("calls: " + counter);

	}

	public static int fibo(int n) {

		int[] fibs = new int[n+1];
		fibs[0]=0;
		fibs[1]=1;
		
		for (int i=2;i<=n;i++) {
			counter++;

			fibs[i]=fibs[i-1]+fibs[i-2];
		}
		
		return fibs[n];
	}
}
