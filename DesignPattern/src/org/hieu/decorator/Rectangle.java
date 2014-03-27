package org.hieu.decorator;

import org.hieu.decorator.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}
