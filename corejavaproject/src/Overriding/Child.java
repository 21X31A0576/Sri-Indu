package Overriding;

public class Child extends Father{

	
	void drinking() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.drinking();
	}
}
