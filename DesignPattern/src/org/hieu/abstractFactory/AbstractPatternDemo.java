package org.hieu.abstractFactory;

public class AbstractPatternDemo {
	public static void main (String args[]){
		FactoryProducer fProducer = new FactoryProducer();
		AbstractFactory colorFactory = fProducer.getFactory("COLOR_FACTORY");
		AbstractFactory shapeFactory = fProducer.getFactory("SHAPE_FACTORY");
		Color red = colorFactory.getColor("RED");
		Color green = colorFactory.getColor("GREEN");
		Shape circle = shapeFactory.getShape("CIRCLE");
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		
		red.fill();
		green.fill();
		circle.draw();
		rectangle.draw();
	}
}
