package org.hieu.state;

/**
 * @author hieu
 *
 *In State pattern a class behavior changes based on its state. This type of design pattern
comes under behavior pattern.

In State pattern, we create objects which represent various states and a context object whose
behavior varies as its state object changes.

We're going to create a State interface defining a action and concrete state classes
implementing theState interface. Context is a class which carries a State.

StaePatternDemo, our demo class will use Context and state objects to demonstrate change in
Context behavior based on type of state it is in.

 */
public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}
}
