package ocp;

public class Square extends Figure {

	private float length;
	
	public Square(float length) {
		super();
		this.length = length;
	}
	
	@Override
	public void draw() {
		System.out.println("SQUARE => length: " + this.length);
	}

	@Override
	public double getArea() {
		return length*length;
	}

}
