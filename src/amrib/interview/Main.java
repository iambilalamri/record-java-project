package amrib.interview;

public class Main implements InterfaceB, InterfaceA {

	public static void main(String[] args) {
		String ab = "abcdefghi";
		String c = ab.substring(4, 6); // ef
		System.out.println(c);
		System.out.println("****************************");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		InterfaceA.super.method();
	}

}
