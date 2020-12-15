package bamri.hackerrank;

import java.util.List;

public class Solution3 {

	public static void main(String[] args) {
		int[] array1 = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		int[] array2 = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
		// longestIncreaseArray(array1);
		System.out.println("FIB: " + fibonacci(9));
		System.out.println("FACT:" + factorial(3));
		// System.out.println(foo(1));
		System.out.println();
		maxiInKv(array2, 4);
	}

	// A voir
	public static void optimium(int[] arr) {
		int leftSum = 0;
		int rightSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				leftSum += arr[j];
			}
			for (int k = arr.length - 1; k > i; k++) {
				rightSum += arr[k];
			}
		}
		if (Math.abs(rightSum) == Math.abs(leftSum))
			System.out.println(true);
		System.out.println(false);
	}

	public static void maxiInKv(int[] arr, int k) {
		int max;
		int n = arr.length;
		for (int i = 0; i <= n - k; i++) {
			max = arr[i];
			for (int j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.print(max + " ");
		}
	}

	public static void longestIncreaseArray(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			
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
