package org.hieu.builer;

public abstract class ColdDrink implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String packing() {
		// TODO Auto-generated method stub
		Packing bottle = new Bottle();
		return bottle.pack();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
