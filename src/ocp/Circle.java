package ocp;

public class Circle extends Figure {

	private float diameter;
	
	public Circle(float diameter) {
		super();
		this.diameter = diameter;
	}
	
	@Override
	public void draw() {
		System.out.println("CIRCLE => diameter: " + this.diameter);
	}

	@Override
	public double getArea() {
		return (Math.PI/4)*(diameter*diameter);
	}

}
