package jayslabs.datastructures.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {12,32,87,98,5,1,7,3,45,76,78};

		System.out.println("Before sort: ");
		for (int i:arr)
			System.out.print(" " +i);
		sort(arr);
		
		System.out.println("\nSorted: ");
		for (int i:arr)
			System.out.print(" " +i);
	}
	
	public static void sort(int[] arr) {
		int temp;

		for (int i=arr.length-1;i>0;i--) {
			for (int j=0;j<i;j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
