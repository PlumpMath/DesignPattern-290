package org.hieu.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		Shape circle = sf.getShape("CIRCLE");
		Shape rect = sf.getShape("RECTANGLE");
		circle.draw();
		rect.draw();
	}

}
