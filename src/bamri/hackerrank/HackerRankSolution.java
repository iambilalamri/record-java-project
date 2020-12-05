package bamri.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class HackerRankSolution {

	public static void main(String[] args) {
		int[] numbers = new int[] { -1, 3, 7, 4, 8 };
		int target = 7;
		int[] result = getTwoSum(numbers, target);
		System.out.println(result[0] + " " + result[1]);

		// **********************************************

		String chaine1 = "JesuisLa";
		String chaine2 = "HelloWorld";
		reverse(chaine1);
		reversing(chaine2);

		// ***********************************************

		int arr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		System.out.println("Columns: " + arr[0].length);
		System.out.println("Rows: " + arr.length);
		getDialgonale(arr);
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

	public static void getDialgonale(int[][] matrix) {
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

}
