package amrib.interview;

public interface InterfaceA {
	// public void print();
	
	default void method() {
		System.out.println("method of interface A");
	}

}