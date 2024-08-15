package jayslabs.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class StringAnalyzer {

	public static void main(String[] args) {
		int val = matchingCharacters("mmmerme");
		System.out.print("val: " + val);

	}

	
	public static int matchingCharacters(String str) {
        int maxUnique = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    String substring = str.substring(i + 1, j);
                    Set<Character> uniqueChars = new HashSet<>();
                    for (char c : substring.toCharArray()) {
                        uniqueChars.add(c);
                    }
                    maxUnique = Math.max(maxUnique, uniqueChars.size());
                }
            }
        }

        return maxUnique;
    }
}
