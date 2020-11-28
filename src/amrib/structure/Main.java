package amrib.structure;

public class Main {

	public static void main(String[] args) {
		int[] test = new int[4];
		test[0] = 10;
		test[1] = 56;
		test[2] = 15;
		test[3] = 65;
		Array numbers = new Array(4);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(65);
		// numbers.removeFromStart();
		// numbers.removeAt(1);
		// System.out.println(numbers.indexOf(40));
		// System.out.println("Max: " + numbers.max());
		// numbers.print();
		numbers.intersect(test).print();
	}

}
