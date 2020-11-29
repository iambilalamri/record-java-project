package amrib.recorded;

public class ArrayOperation {

	public static void main(String[] args) {
		int a[] = new int[5];

		for (int j = 0; j < a.length; j++) {
			insert(a, j + 1);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	static int count;

	public static void insert(int[] a, int val) {
		a[count++] = val;
	}

	public static void insertinFront(int arr[], int val) {
		for (int i = arr.length; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		insertinFront(arr, val);
	}
}
