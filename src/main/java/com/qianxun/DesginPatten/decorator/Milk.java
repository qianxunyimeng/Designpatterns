package com.qianxun.DesginPatten.decorator;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		setDes(" 牛奶 ");
		setPrice(2.0f);//调味品的价格
	}

}
