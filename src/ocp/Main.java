package ocp;

public class Main {
	
	public static void main(String[] args) {
		
		Sheet sheet = new Sheet();
		Circle circle = new Circle((float) 1.5);
		Circle circle1 = new Circle((float) 2.5);
		Square square = new Square((float) 0.3);
		Diamond diamond = new Diamond((float) 0.3, (float) 0.3);
		
		sheet.addFigure(circle);
		sheet.addFigure(circle1);
		sheet.addFigure(square);
		sheet.addFigure(diamond);
		
		sheet.drawFigures();
		System.out.println("-------------------------------");
		sheet.getFigureAreas();
		
		
	}
	
}
