package org.hieu.frontcontroller;

/**
 * @author hieu
 *
 *The front controller design pattern is used to provide a centralized request handling
mechanism so that all requests will be handled by a single handler. This handler can do the
authentication/ authorization/ logging or tracking of request and then pass the requests to
corresponding handlers. Following are the entities of this type of design pattern.

Front Controller - Single handler for all kind of request coming to the application
(either web based/ desktop based).

Dispatcher - Front Controller may use a dispatcher object which can dispatch the
request to corresponding specific handler.

View - Views are the object for which the requests are made.

We're going to create a FrontController, Dispatcher to act as Front Controller and Dispatcher
correspondingly. HomeView and StudentView represent various views for which requests can
come to front controller.

FrontControllerPatternDemo, our demo class will use FrontController ato demonstrate Front
Controller Design Pattern.


 */
public class FrontControllerPatternDemo {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
