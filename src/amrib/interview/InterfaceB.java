package amrib.interview;

public interface InterfaceB {
	public void print();
	default void method() {
		System.out.println("method of interface B");
	}

} 