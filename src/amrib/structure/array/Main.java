package amrib.structure.array;

public class Main {

	public static void main(String[] args) {
		int a[] = { 1, 8, 3 };

		// Create an array b[] of same size as a[]
		int b[] = new int[a.length];

		// Doesn't copy elements of a[] to b[], only makes
		// b refer to same location
		b = a;

		// Change to b[] will also reflect in a[] as 'a' and
		// 'b' refer to same location.
		b[0]++;

		System.out.println("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
	// ****************************
	int[] test = new int[4];
	test[0]=10;test[1]=56;test[2]=15;
	Array numbers = new Array(4);numbers.insert(10);numbers.insert(20);numbers.insert(30);numbers.insert(65);
	// numbers.removeFromStart();
	// numbers.removeAt(1);
	// System.out.println(numbers.indexOf(40));
	// System.out.println("Max: " + numbers.max());
	// numbers.print();
	// numbers.intersect(test).print();
	// numbers.insertAt(5, 0);
	// numbers.print();
	System.out.println(numbers.reverse());
}

}
