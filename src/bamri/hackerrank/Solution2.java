package bamri.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		String txt = "abla";
		var repeat = txt;
		System.out.println(repeat);
		long value = repeatedString(txt, 9);
		System.out.println(value);
		System.out.println("*************************");
		int[] integers = { 2, 1, 1, 1, 1, 1, 1, 2, 3, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 3 };
		duplicateInteger(integers);
		System.out.println("**************");
		int[] sorted1 = { 0, 2, 0, 3, 0, 5, 6, 0, 0, 7, 19, 0 };
		int[] sorted2 = { 1, 8, 9, 10, 15, 17 };
		avoidVacant(sorted1, sorted2);
		System.out.println();
		System.out.println("*******************");
		int[] tab1 = { 5, 3, -2, 9, 8, 2, -4 };
		int[] tab2 = { 0, -3, 5, -4, -2, 3, 1, 0 };
		equilibriumIndex(tab1);
		equilibriumIndex(tab2);
		System.out.println("****************");
		int[] tab3 = { 0, 2, 0, 5, 0, 8, 3, 1, 0 };// valid
		int[] tab4 = { 0, 0, 0, 6, 0, 8, 2, 0, 0, 3, 0, 0, 4, 0, 1, 0, 2, 0, 5 };// not valid
		zeroToEnd(tab3);
		System.out.println();
		zeroToEnd(tab4);
		System.out.println();
		System.out.println("******************");
		int[] testArray = { 3, 9, 50, 15, 99, 7, 96, 65, 11, 20, 19 };
		// int result = distClosestNumbers(testArray);
		closedNumbers(testArray);
		int[] ints = {-9, 14, 37, 102};
		System.out.println(exists(ints, 102)); // true
		System.out.println(exists(ints, 36)); // false
	}

	public static boolean exists(int[] ints, int k) {
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == k)
				return true;
		}
		return false;
	}

	public static void closedNumbers(int[] arr) {
		int min = arr[arr.length - 1], val = 0;
		int first = 0, second = 0;
		Arrays.sort(arr);
		for (int i = arr.length - 1; i > 0; i--) {
			val = arr[i] - arr[i - 1];
			if (min > val) {
				min = val;
				first = arr[i];
				second = arr[i - 1];
			}
		}
		System.out.println(first + "," + second);
	}

	public static void zeroToEnd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		for (int i = count; i < arr.length; i++) {
			arr[i] = 0;
		}

		for (int item : arr) {
			System.out.print(item + " ");
		}
	}

	public static void equilibriumIndex(int[] arr) {
		int sumLeft = 0, sumRight = 0;
		int i;
		for (i = 0; i < arr.length / 2; i++) {
			sumLeft += arr[i];
			sumRight += arr[arr.length - 1 - i];
		}
		if (Math.abs(sumRight) == Math.abs(sumLeft)) {
			System.out.println(i);
		}
	}

	public static void avoidVacant(int[] arr1, int[] arr2) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == 0) {
					arr1[i] = arr2[count++];
				}
			}
		}
		Arrays.sort(arr1);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

	public static void merge(int[] X, int[] Y) {
		int m = X.length;
		int n = Y.length;

		for (int i = 0; i < m; i++) {
			if (X[i] > Y[0]) {
				int temp = X[i];
				X[i] = Y[0];
				Y[0] = temp;

				int first = Y[0];
				int k;
				for (k = 1; k < n && Y[k] < first; k++) {
					Y[k - 1] = Y[k];
				}

				Y[k - 1] = first;
			}
		}
	}

	public static void duplicateInteger(int[] integers) {
		int count = 0, duplicated = 0;
		Arrays.sort(integers);
		List<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < integers.length; i++) {
			if (count < integers.length - 1 && integers[i] == integers[++count]) {
				duplicated = integers[count];
				if (!ints.contains(duplicated)) {
					ints.add(duplicated);
				}
			}
		}
		System.out.println(ints);
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
