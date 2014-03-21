package org.hieu.abstractFactory;

public interface AbstractFactory {
	public Shape getShape(String shapeName);
	public Color getColor(String colorName);
}
