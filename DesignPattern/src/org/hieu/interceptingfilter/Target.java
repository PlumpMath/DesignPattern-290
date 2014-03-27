package org.hieu.interceptingfilter;

public class Target {
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}
