package Overriding;

public class Father {

	void drinking() {
		System.err.println("Boost");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.drinking();
	}
}
