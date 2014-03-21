package org.hieu.abstractFactory;

public class ShapeFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shapeName) {
		// TODO Auto-generated method stub
		if (shapeName.equals("CIRCLE")){
			return new Circle();
		} else if (shapeName.equals("RECTANGLE")){
			return new Rectangle();
		} else {
			return null;
		}
	}

	@Override
	public Color getColor(String colorName) {
		// TODO Auto-generated method stub
		return null;
	}

}
