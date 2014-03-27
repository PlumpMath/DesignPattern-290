package org.hieu.decorator;

/**
 * @author hieu
 *
 *Decorator pattern allows adding new functionality an existing object without altering its
structure. This type of design pattern comes under structural pattern as this pattern acts as a
wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional
functionality keeping class methods signature intact.

We are demonstrating use of Decorator pattern via following example in which we'll decorate a
shape with some color without alter shape class.

We're going to create a Shape interface and concrete classes implementing the Shape interface.
We then create a abstract decorator class ShapeDecorator implementing the Shape interface
and havingShape object as its instance variable.

RedShapeDecorator is concrete class implementing ShapeDecorator.

DecoratorPatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects.

 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();
		System.out.println("\nCircle of red border");
		redCircle.draw();
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
