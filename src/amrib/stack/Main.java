package amrib.stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(12);
		stack.push(10);
		stack.push(16);
		// System.out.println(stack);
		var top = stack.pop();
		// System.out.println(top);
		// System.out.println(stack);
		top = stack.peek();
		// System.out.println(top);
		// System.out.println(stack);
		//-------------------------
		String str = "abcd";
		StringReverser reverser = new StringReverser();
		// System.out.println(reverser.reverse(str));
		//--------------------------
		String str1 = "(a+b)";
		Expression exp = new Expression();
		var result = exp.isBalanced(str1);
		System.out.println(result);
		
	}

}
