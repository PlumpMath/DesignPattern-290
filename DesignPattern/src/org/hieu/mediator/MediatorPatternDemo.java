package org.hieu.mediator;

/**
 * @author hieu
 *
 *Mediator pattern is used to reduce communication complexity between multiple objects or
classes. This pattern provides a mediator class which normally handles all the communications
between different classes and supports easy maintainability of the code by loose coupling.
Mediator pattern falls under behavioral pattern category.

We're demonstrating mediator pattern by example of a Chat Room where multiple users can
send message to Chat Room and it is the responsibility of Chat Room to show the messages to
all users. We've created two classes ChatRoom and User. User objects will use ChatRoom method 
to share their messages.

MediatorPatternDemo, our demo class will use User objects to show communication between
them
 *
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
