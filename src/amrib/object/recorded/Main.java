package amrib.object.recorded;

public class Main {

	public static void main(String[] args) {
		// var list = Arrays.asList(5, 1, 9, 4, 7, 3);
		// System.out.println(list);
		// Collections.reverse(list);
		// System.out.println(list);

		// *******************************

		// exercice1();
		// exercice2();
		// exercice3();
		// exercice4();
		// exercice5();
		// exercice6();
		// exercice7();
		// exercice9();
		// exercice10();
		// System.out.println("***********");
		// exercice11();
		// exercice12();
		// exercice13();
		// exercice14();
		// exercice15();
		// exercice16();
		// exercice17();
		exerciceD();
		exerciceB();
		// exercice19();
		// exercice20();
		// exercice21();
		// exercice22();
		// System.out.println();
		// System.out.println("******");
		// System.out.println();
		// exerciceA();
		// System.out.println();
		// exerciceC();
		int[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr, arr.length);
	}

	public static void reverse(int a[], int n) {
		int i, k, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		/* printing the reversed array */
		System.out.println("Reversed array is: \n");
		for (k = 0; k < n; k++) {
			System.out.print(a[k]);
		}
	}

	public static void exerciceA() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exerciceB() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exerciceC() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void exerciceD() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

	public static void exercice22() {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j > i; j--) {
				System.out.print(" ");
			}
			for (char k = 'A'; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void exercice21() {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j > i; j--) {
				System.out.print(" ");
			}
			for (char k = 'A'; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void exercice20() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void exercice19() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

	public static void exercice17() {
		for (char ch1 = 'A'; ch1 <= 'E'; ch1++) {
			for (char ch2 = 'E'; ch2 >= ch1; ch2--) {
				System.out.print(ch2);
			}
			System.out.println();
		}
	}

	public static void exercice16() {
		for (char ch1 = 'E'; ch1 >= 'A'; ch1--) {
			for (char ch2 = 'A'; ch2 <= ch1; ch2++) {
				System.out.print(ch1);
			}
			System.out.println();
		}
	}

	public static void exercice15() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice14() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void exercice13() {
		for (char ch1 = 'E'; ch1 >= 'A'; ch1--) {
			for (char ch2 = 'A'; ch2 <= ch1; ch2++) {
				System.out.print(ch2);
			}
			System.out.println();
		}
	}

	// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

	public static void exercice12() {
		for (char ch1 = 'A'; ch1 <= 'E'; ch1++) {
			for (char ch2 = 'E'; ch2 >= ch1; ch2--) {
				System.out.print(ch1);
			}
			System.out.println();
		}
	}

	public static void exercice11() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice10() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void exercice9() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice8() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice7() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

	public static void exercice5() {
		for (char ch1 = 'A'; ch1 <= 'E'; ch1++) {
			for (char ch2 = 'A'; ch2 <= 'E'; ch2++) {
				System.out.print(ch1);
			}
			System.out.println();
		}
	}

	public static void exercice4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice3() {
		System.out.println("@");
		for (int i = 5; i >= 1; i--) {
			System.out.print("@");
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.println(" @");
		}
		for (int j = 0; j < 5; j++) {
			System.out.print("@ ");
		}
	}

	public static void exercice2() {
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			for (int k = 6; k >= i; k--) {
				System.out.print("&");
			}
			System.out.println("");
		}
	}

	// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

	public static void exercice1() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 6; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
