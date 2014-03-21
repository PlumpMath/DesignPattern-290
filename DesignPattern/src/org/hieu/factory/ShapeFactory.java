package org.hieu.factory;

public class ShapeFactory {
	public Shape getShape(String shapeName) {
		if (shapeName.equals("CIRCLE")){
			return new Circle();
		} else if (shapeName.equals("RECTANGLE")){
			return new Rectangle();
		} else {
			return null;
		}	
	}
}
