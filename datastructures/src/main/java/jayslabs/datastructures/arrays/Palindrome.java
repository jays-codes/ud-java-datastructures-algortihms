package jayslabs.datastructures.arrays;

public class Palindrome {

	public static void main(String[] args) {
		//String str = "9123456543219";
		String str = "";
		
		
		System.out.println("is palin: " + isPalindrome(str));
	}
	
	public static boolean isPalindrome(String arr) {
		boolean isp = false;
		if (arr.isEmpty()) return false;
		
		char[] charr = arr.toCharArray();
		
		for (int i=0, j=charr.length-1;i<j;i++,j--) {
			if (charr[i]!=charr[j]) return false;
		}
		
		return true;
	}

}
