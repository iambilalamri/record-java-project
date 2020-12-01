package bamri.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 2, -1, -2, 0 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		// plusMinus(arr1);
		System.out.println("************************");
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(7);
		list1.add(5);
		list1.add(9);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(6);
		list2.add(1);
		list2.add(3);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(8);
		list3.add(4);
		list3.add(9);

		matrix.add(list1);
		matrix.add(list2);
		matrix.add(list3);
		// System.out.println(matrix);
		// System.out.println(findDiagonale(matrix));
		System.out.println("************************");
		miniMaxSum(arr2);
	}

	public static int findDiagonale(List<List<Integer>> matrix) {
		int sum1 = 0;
		int sum2 = 0;
		int difference;
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				if (i == j) {
					// sum1 += matrix.get(i).get(j);
					// Collections.reverse(matrix);
					// sum2 += matrix.get(i).get(j);
					sum1 += matrix.get(i).get(i);
					sum2 += matrix.get(i).get(matrix.get(i).size() - 1 - i);
				}
			}
		}
		difference = sum1 + sum2;

		return difference;
	}

	public static void plusMinus(int[] arr) {
		double zero = 0;
		double neg = 0;
		double pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos++;
			} else if (arr[i] < 0) {
				neg++;
			} else {
				zero++;
			}
		}
		System.out.println(pos / arr.length);
		System.out.println(neg / arr.length);
		System.out.println(zero / arr.length);
	}

	public static void miniMaxSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("somme: " + sum);
	}
}
