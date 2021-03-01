package com.qianxun.DesginPatten.decorator;

//具体的Decorator，案例中的调味品，巧克力，牛奶。。。
public class Chocolate extends Decorator{

	public Chocolate(Drink obj) {
		super(obj);
		setDes(" 巧克力 ");
		setPrice(3.0f);//调味品的价格
	}

}
