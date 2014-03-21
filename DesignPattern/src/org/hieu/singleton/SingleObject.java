package org.hieu.singleton;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	
	public void showMessage(){
		System.out.println("SingleObject class ShowMessage method");
	}
	
	public static SingleObject getInstance(){
		return instance;
	}
}
