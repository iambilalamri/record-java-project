package amrib.interview;

public class Main implements InterfaceB, InterfaceA {

	public static void main(String[] args) {
		String ab = "abcdefghi";
		String c = ab.substring(4, 6); // ef
		System.out.println(c);
		System.out.println("****************************");
		int b = 5, d = 2, e = 3, f = 2;
		// int result1 = b++ + ++d - ++e + f++;
		int result2 = b-- + --d - --e + f--;
		System.out.println(b);
		System.out.println(d);
		// System.out.println(result1);
		System.out.println(result2);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		// InterfaceB.super.method();
		InterfaceA.super.method();
	}

}
