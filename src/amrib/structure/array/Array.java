package amrib.structure.array;

public class Array {

	private int[] items;
	private int count;

	public Array(int size) {
		this.items = new int[size];
	}

	public void insert(int item) {

		// If the array is full, resize it
		if (items.length == count) {
			// create new array with double length
			int[] newItems = new int[items.length * 2];
			// copy the value of item in new created array
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			// set new array to items
			items = newItems;
		}
		// add the new element at end
		items[count++] = item;
	}

	public void print() {
		/**
		 * On faut pas mettre le size du tableau dans la condition, pour savoir vraiment
		 * combien de valeur existe to keep the track of number added
		 */
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}

	public void removeFromStart() {
		for (int i = 0; i < count; i++) {
			items[i] = items[i + 1];
		}
		count--;
	}

	public void removeFromEnd() {
		for (int i = count; i >= count; i--) {
			items[i] = items[i + 1];
		}
	}

	public void removeAt(int index) {
		// Validate the index
		if (index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		// Shift the items to left to fill the hole
		for (int i = index; i < count; i++) {
			items[i] = items[i + 1];
		}
		count--;
	}

	public int indexOf(int item) {
		// If we find it, return index;
		for (int i = 0; i < count; i++) {
			// if element is in first i.e. items[0] -> Time complexity O(1)= Best Scenario
			// Otherwise item[1..n] -> Time complexity O(n) = Worst case SCENARIO
			// So Time complexity is worst scenario = O(n)
			if (items[i] == item) {
				return i;
			}
		}
		// otherwise return -1
		return -1;
	}

	public int max() {
		int max = items[0];
		for (int i = 0; i < count; i++) {
			if (items[i] > max)
				max = items[i];
		}
		return max;
	}

	public Array intersect(int[] arr) {
		Array commonItem = new Array(count);
		for (int i = 0; i < count; i++) {
			if (items[i] == arr[i]) {
				commonItem.insert(items[i]);
			}
		}
		return commonItem;
	}

	public void insertAt(int item, int index) {
		if (index < 0 || index > count)
			throw new IllegalArgumentException();

		if (items.length == count) {
			// create new array with double length
			int[] newItems = new int[count * 2];
			// copy the value of item in new created array
			for (int j = 0; j < count; j++) {
				newItems[j] = items[j];
			}
			// set new array to items
			items = newItems;
		}
		for (int i = count; i >= index; i--) {
			items[i + 1] = items[i];
		}
		items[index] = item;
		count++;
	}

	public int[] reverse() {
		int[] reverse = new int[count];
		int j = count;
		for (int i = 0; i < count; i++) {
			reverse[j - 1] = items[i];
			j = j - 1;
		}
		return items;
	}
}
