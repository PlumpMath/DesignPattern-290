package org.hieu.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCache.loadCache();
		
		Shape clonedShape1 = ShapeCache.getShape("1");
		clonedShape1.draw();
		Shape clonedShape2 = ShapeCache.getShape("2");
		clonedShape2.draw();
	}

}
