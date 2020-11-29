package amrib.recorded;

import java.util.Arrays;

public class ExerciceMain {

	public static void main(String[] args) {
		// pyramid_sol1();

		int[] testingArray = { 4, 7, 9, 2, -2, -1, 1 };
		int result = getClosestToZero(testingArray);
		System.out.println("The Closest Number To Zero in this Array is : " + result);

	}

	public static int getClosestToZero(int[] a) {
		int currentValue = 0;
		int closestVal = a[0];
		Arrays.sort(a);

		for (int index = 0; index < a.length; index++) {
			currentValue = a[index] * a[index];
			if (currentValue <= (closestVal * closestVal)) {
				closestVal = a[index];
			}
		}
		return closestVal;
	}

	public static void pyramid_sol2() {
		int p_height = 5;
		int min_stars = 1;
		int p_space = p_height - 1;
		for (int i = 0; i < p_height; i++) {
			for (int j = p_space; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < min_stars; k++) {
				System.out.print("*");
			}
			min_stars += 2;
			System.out.println();
		}
	}

	public static void pyramid_sol1() {
		int rows = 10, k = 0;

		for (int i = 1; i <= rows; ++i, k = 0) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
			}

			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}

			System.out.println();
		}
	}

}
