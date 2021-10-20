package ocp;

public class Diamond extends Figure {

	private float height;
	private float width;
	
	public Diamond(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void draw() {
		System.out.println("DIAMOND => height: " + this.height + ", width: " + this.width);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height*width/2;
	}

}
