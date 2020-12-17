package amrib.binaryTree;

public class Main {

	public static void main(String[] args) {
		// Tree (root)
		// Node (Value, leftChild, rightChild)
		Tree tree = new Tree();
		tree.insert(5);
		tree.insert(4);
		tree.insert(9);
		tree.insert(1);
		tree.insert(6);
		tree.insert(8);
		tree.insert(10);
		System.out.println(tree.find(10));
		System.out.println(tree.find(7));
		System.out.println("Done");
	}

}
