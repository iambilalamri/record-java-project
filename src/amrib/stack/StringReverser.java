package amrib.stack;

import java.util.Stack;

public class StringReverser {

	public String reverse(String input) {
		if (input == null)
			throw new IllegalArgumentException();
		Stack<Character> stack = new Stack<Character>();
		// 1er solution de For
		// for (int i = 0; i < input.length(); i++) {
		// stack.push(input.charAt(i));
		// }
		// 2eme solution de For
		for (char ch : input.toCharArray()) {
			stack.push(ch);
		}
		StringBuffer reversed = new StringBuffer();
		while (!stack.isEmpty())
			reversed.append(stack.pop());

		return reversed.toString();
	}

}
