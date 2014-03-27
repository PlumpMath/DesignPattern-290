package org.hieu.proxy;

/**
 * @author hieu
 *
 *In Proxy pattern, a class represents functionality of another class. This type of design pattern
comes under structural pattern.

In Proxy pattern, we create object having original object to interface its functionality to outer
world.

We're going to create a Image interface and concrete classes implementing
the Image interface.ProxyImage is a a proxy class to reduce memory footprint
of RealImage object loading.

ProxyPatternDemo, our demo class will use ProxyImage to get a Image object to load and
display as it needs.

 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		// image will be loaded from disk
		image.display();
		System.out.println("");
		// image will not be loaded from disk
		image.display();
	}
}
