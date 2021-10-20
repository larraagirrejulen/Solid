package ocp;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {
	
	private Vector<Figure> figures = new Vector<Figure>();
	
	public void addFigure(Figure f){
		figures.add(f);
	}
	
	public void drawFigures(){
		Enumeration<Figure> efigure = figures.elements();
		Figure s;
		while (efigure.hasMoreElements()){
			s=efigure.nextElement();
			s.draw();
		}
	}
	
	public void getFigureAreas(){
		Enumeration<Figure> efigure = figures.elements();
		Figure s;
		while (efigure.hasMoreElements()){
			s=efigure.nextElement();
			System.out.println(s.getArea());
		}
	}
	
}
