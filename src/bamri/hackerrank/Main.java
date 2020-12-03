package bamri.hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		int[] arr1 = { 1, 3, 2, -1, -2, 0 };
		int[] arr2 = { 769082435, 210437958, 673982045, 375809214, 380564127 };
		int[] arr3 = { 1, 2, 3, 4, 5, 5 };
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(7);
		list.add(15);
		list.add(-7);
		list.add(2);
		// System.out.println(list.stream().max(Integer::compare).get());
		// Integer min = list.stream().min(Integer::compare).get();
		// System.out.println("Min: " + min);
		// System.out.println("Max");

		// plusMinus(arr1);
		System.out.println("************************");
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(7);
		list1.add(14);
		list1.add(5);
		list1.add(14);
		list1.add(9);
		list1.add(14);

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
		// miniMaxSum(arr3);
		// System.out.println(birthdayCakeCandles(list1));
		// System.out.println(timeConversion("07:05:45PM"));
		// System.out.println(counterGame(5));
		// System.out.println(isPowerOfTwo(5));
		double floatant = 5.9;
		int entier = (int) floatant;
		// System.out.println(entier);
		solve(10.25, 15, 5);
	}

	public static boolean isPowerOfTwo(long n) {
		return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
	}

	static String counterGame(long n) {
		long turn = 0;
		turn += numberOfSetBits(n);
		turn += Long.numberOfTrailingZeros(n);
		if (turn % 2 == 1)
			return "Louise";
		return "Richard";
	}
	
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent/100;
        double tax = tax_percent * tip_percent/100;
        
        System.out.println(Math.round(meal_cost+tax+tip));
        
    }

	static int numberOfSetBits(long n) {
		int setBits = 0;
		while (n != 0) {
			long check = (n & 1);
			if (check == 1)
				setBits++;
			n = (n >> 1);
		}
		return setBits - 1;
	}

	public static String counterGamee(long n) {
		boolean player = false;
		int solution1;
		int solution2;
		long result = 0;
		if (isPowerOfTwo(n)) {
			result = n / 2;

		} else if (!isPowerOfTwo(n)) {
			solution2 = (int) (Math.log(n) / Math.log(2));
			result = n - solution2;
			Long.numberOfLeadingZeros(n);
		}
		if (result == 1) {
			String winner = "";
		}

		return "";
	}

	public static String timeConversion(String s) {
		if (s.substring(8, 10).equals("PM")) {
			if (!s.substring(0, 2).equals("12")) {
				s = (Integer.parseInt(s.substring(0, 2)) + 12) + s.substring(2, 8);
			} else {
				s = s.substring(0, 8);
			}
		} else if (s.substring(0, 2).equals("12") && s.substring(8, 10).equals("AM")) {
			s = "00" + s.substring(2, 8);

		} else {
			s = s.substring(0, 8);
		}

		return s;

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

	public static void miniMaxSums(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				count++;
				if (i != 0 && j == 0)
					count = 0;
				if (i != count && count < arr.length) {
					sum += arr[count];
					// System.out.print(arr[count]);
				}
			}
			// System.out.println();
			list.add(sum);
		}
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
	}

	public static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long min = 0, max = 0;
		for (int i = 0, j = arr.length - 1; i < arr.length - 1; i++, j--) {
			max = +arr[j];
			min = +arr[i];
		}
		System.out.println(min + " " + max);
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		int count = 0;
		int max = candles.get(0);
		for (int i = 0; i < candles.size(); i++) {
			if (candles.get(i) > max) {
				max = candles.get(i);
				count = 1;
			} else if (candles.get(i) == max) {
				count++;
			}
		}

		return count;
	}
}
