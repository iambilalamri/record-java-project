package bamri.hackerrank;

public class Solution2 {

	public static void main(String[] args) {
		String txt = "abla";
		var repeat = txt;
		System.out.println(repeat);
		long value = repeatedString(txt, 4);
		System.out.println(value);
	}

	public static long repeatedString(String s, long n) {
		int strLength = s.length();
		long q = 0, r = 0;
		q = n / strLength;
		r = n % strLength;
		long partialStrLen = (r == 0) ? 0 : r;
		long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
		return aCount;
	}

	public static long getLetterCount(String s, long strLength) {
		long count = 0;
		for (int i = 0; i < strLength; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

}
