package amrib.stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(12);
		stack.push(10);
		stack.push(16);
		System.out.println(stack);
		var top = stack.pop();
		System.out.println(top);
		System.out.println(stack);
		top = stack.peek();
		System.out.println(top);
		System.out.println(stack);
		//-------------------------
		String str = "abcd";
		StringReverser reverser = new StringReverser();
		System.out.println(reverser.reverse(str));
		
	}

}
