package abstraction;

public abstract class Shape {

	protected float area;
	//abstraction method
	abstract void calarea();
	//concrete method
	void show() {
		System.out.println("area of the shape"+area);
	}
}
