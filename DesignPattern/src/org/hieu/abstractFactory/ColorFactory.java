package org.hieu.abstractFactory;

public class ColorFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shapeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		// TODO Auto-generated method stub
		if (colorName.equals("RED")){
			return new Red();
		} else if (colorName.equals("GREEN")){
			return new Green();
		} else {
			return null;
		}
	}

}
