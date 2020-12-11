package bamri.hackerrank;

public class Solution3 {

	public static void main(String[] args) {
		int[] array1 = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		// longestIncreaseArray(array1);
		System.out.println("FIB: " + fibonacci(9));
		System.out.println("FACT:" + factorial(3));
	}

	public static void longestIncreaseArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

		}
	}

	public static int fibonacci(int k) {
		if (k <= 2)
			return 1;
		return fibonacci(k - 1) + fibonacci(k - 2);
	}

	public static int factorial(int k) {
		if (k == 0)
			return 1;
		return k * factorial(k - 1);
	}
}
