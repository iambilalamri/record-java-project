package amrib.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;
	int size = 0;

	// add Last
	public void addLast(int item) {
		var node = new Node(item);
		if (first == null)
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
		size++;
	}

	// add First
	public void addFirst(int item) {
		var node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
			node.next = first;
			first = node;
		}
		size++;
	}

	private boolean isEmpty() {
		return first == null;
	}

	// delete First
	public void deleteFirst() {
		if (isEmpty())
			throw new NoSuchElementException();
		if (first == last) {
			first = last = null;
		} else {
			var second = first.next;
			first.next = null;
			first = second;
		}
		size--;
	}

	// delete Last
	public void deleteLast() {
		if (isEmpty())
			throw new NoSuchElementException();
		if (first == last) {
			first = last = null;

		} else {
			var previous = getPrevious(last);
			last = previous;
			last.next = null;
		}
		size--;

	}

	private Node getPrevious(Node node) {
		var current = first;
		while (current != null) {
			if (current.next == node)
				return current;
			current = current.next;
		}
		return null;
	}

	// contains
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}

	// indexOf
	public int indexOf(int item) {
		int index = 0;
		var current = first;
		while (current != null) {
			if (current.value == item)
				return index;
			current = current.next;
			index++;
		}
		return index;
	}

	// size
	public int size() {
		return size;
	}

	// toArray
	public int[] toArray() {
		int[] array = new int[size];
		var current = first;
		var index = 0;
		while (current != null) {
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}
	
	public void reverse() {
		
	}
}
