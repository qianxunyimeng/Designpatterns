package com.qianxun.DesginPatten.decorator;

public class Coffee extends Drink {

	@Override
	public float cost() {
		
		return super.getPrice();
	}

}
