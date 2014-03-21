package org.hieu.abstractFactory;

public class FactoryProducer {
	public AbstractFactory getFactory(String factoryName) {
		if (factoryName.equals("SHAPE_FACTORY")){
			return new ShapeFactory();
		} else if (factoryName.equals("COLOR_FACTORY")){
			return new ColorFactory();
		} else {
			return null;
		}
	}
}
