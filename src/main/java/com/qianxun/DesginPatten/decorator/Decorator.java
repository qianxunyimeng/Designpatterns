package com.qianxun.DesginPatten.decorator;

//装饰者
public class Decorator extends Drink {

	private Drink obj;//被装饰者
	
	
	public Decorator(Drink obj) {
		//super();
		this.obj = obj;
	}


	@Override
	public float cost() {

		return super.getPrice() + obj.cost();
	}


	@Override
	public String getDes() {
		
		return super.des + super.getPrice() + " && " + obj.getDes();
	}

}
