package com.qianxun.DesginPatten.visitor;

public class Woman extends Person {

	@Override
	public void accept(Action action) {
		action.getWomanResult(this);
	}

}
