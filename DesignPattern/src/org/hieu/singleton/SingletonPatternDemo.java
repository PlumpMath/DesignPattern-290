package org.hieu.singleton;

/**
 * @author root
 * Singleton pattern is one of the simplest design patterns in Java. This type of design pattern
comes under creational pattern as this pattern provides one of the best way to create an object.
This pattern involves a single class which is responsible to creates own object while making sure
that only single object get created. This class provides a way to access its only object which can
be accessed directly without need to instantiate the object of the class.

We're going to create a SingleObject class. SingleObject class have its constructor as private and have a static instance of itself.
SingleObject class provides world.SingletonPatternDemo, a SingleObject object. 


 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject singleObject = SingleObject.getInstance();
		singleObject.showMessage();
	}

}
