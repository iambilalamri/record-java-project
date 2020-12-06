package amrib.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		reverse(queue);
		System.out.println(queue);
		System.out.println("*********************");
		// ArrayQueue queue1 = new ArrayQueue(3);
		// queue1.enqueue(20);
		// queue1.enqueue(30);
		// queue1.enqueue(40);

		System.out.println("***********************");
		PriorityQueue<Integer> priority = new PriorityQueue<Integer>();
		priority.add(1);
		priority.add(5);
		priority.add(3);
		priority.add(2);
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

	public static void reverse(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!queue.isEmpty()) {
			stack.push(queue.remove());
			while (!stack.isEmpty())
				queue.add(stack.pop());
		}
	}

}
