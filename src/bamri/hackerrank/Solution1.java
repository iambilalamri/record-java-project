package bamri.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution1 {

	public static void main(String[] args) {
		int[] numbers1 = new int[] { -2, 9, 5, 6, 4 };
		int[] result1 = reverseArray(numbers1);
		for (int elem : result1) {
			System.out.print(elem);
		}
		System.out.println();

		// **********************************************

		String chaine1 = "JesuisLa";
		String chaine2 = "HelloWorld";
		reverse(chaine1);
		reversing(chaine2);

		// ***********************************************

		int arr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		System.out.println("Columns: " + arr[0].length);
		System.out.println("Rows: " + arr.length);
		getDiagonale(arr);

		// ************************************************
		int[] numbers = new int[] { -1, 3, 7, 4, 8 };
		int[] testing = new int[] { 1, 3, 5, 7, 9 };
		System.out.println("*********************");
		int target = 7;
		int[] result = getTwoSum(numbers, target);
		System.out.println(result[0] + " " + result[1]);
		System.out.println("**********************");
		minMaxSumSoution1(numbers);
		minMaxSumSoution2(testing);
	}

	public static void minMaxSumSoution1(int[] arr) {
		int min = 0, max = 0;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			min += arr[i];
		}
		for (int i = arr.length - 1; i > 0; i--) {
			max += arr[i];
		}

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

	public static void minMaxSumSoution2(int[] arr) {
		long min = 0, max = 0, sum = 0;
		min = arr[0];
		max = min;
		sum = min;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println((sum - max) + " " + (sum - min));
	}

	public static int[] getTwoSum(int[] numbers, int target) {
		Map<Integer, Integer> visitedNumbers = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			int delta = target - numbers[i];
			if (visitedNumbers.containsKey(delta)) {
				return new int[] { i, visitedNumbers.get(delta) };
			}
			visitedNumbers.put(numbers[i], i);
		}
		return new int[] { -1, -1 };
	}

	public static void reverse(String string) {
		Stack<Character> characters = new Stack<Character>();
		StringBuffer str = new StringBuffer();

		char[] chars = string.toCharArray();
		for (char ch : chars) {
			characters.push(ch);
		}
		while (!characters.isEmpty()) {
			str.append(characters.pop());
		}
		System.out.println(str.toString());
	}

	public static void reversing(String string) {
		String reversed = new StringBuilder(string).reverse().toString();
		System.out.println(reversed);
	}

	public static void getDiagonale(int[][] matrix) {
		int left_to_right = 0;
		int right_to_left = 0;

		int rows = matrix.length;
		int columns = matrix[0].length;

		int i = 0;
		int j = 0;
		int k = 0;
		int l = matrix.length - 1;

		while (i < rows && j < columns && k < rows && l >= 0) {
			left_to_right += matrix[i][j];
			right_to_left += matrix[k][l];
			i++;
			j++;
			k++;
			l--;
		}
		System.out.println(Math.abs(left_to_right - right_to_left));
	}

	static int[] reverseArray(int[] arr) {
		int len = arr.length - 1;
		for (int i = 0; i <= len / 2; i++) {
			swap(arr, i, len - i);
		}
		return arr;

	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
