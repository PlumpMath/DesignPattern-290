package org.hieu.builer;

public abstract class Burger implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String packing() {
		// TODO Auto-generated method stub
		Packing wrapper = new Wrapper();
		return wrapper.pack();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
