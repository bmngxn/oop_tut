import java.util.HashSet;
import java.util.Set;

/**
 * HW2
 * 
 * @author bmngxn
 * */ 

public class StringCode {
	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */

	public static int maxRun(String str) {
		if (str == null || str.isEmpty()) return 0;

        int maxCount = 1,
			currCount = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currCount++;
            } 
			else {
                if (currCount > maxCount) {
				maxCount = currCount;
                currCount = 1;
				}
            }
        }
        return Math.max(maxCount, currCount);
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}

		StringBuilder s = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				if (i + 1 < str.length()) {
					int reps = c - '0';
					char next = str.charAt(i + 1);
					for (int j = 0;  j < reps; j++) {
						s.append(next);
					}
				}
 			}

			else {
				s.append(c);
			}
		}
		return s.toString();
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		if (len < 1) {
			throw new IllegalArgumentException("invalid len");
		}
        if (a == null || b == null) {
			return false;
		}
        if (len > a.length() || len > b.length()) return false;


		Set<String> visited = new HashSet<>();
		for (int i = 0; i + len <= a.length(); i++) {
            visited.add(a.substring(i, i + len));
        }


        for (int j = 0; j + len <= b.length(); j++) {
            if (visited.contains(b.substring(j, j + len))) {
				return true;
			}
        }
        return false;
	}
}
