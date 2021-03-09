package com.qianxun.DesginPatten.visitor;

public class Success extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("男性评委 评价: 成功" );
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女性评委 评价: 成功" );
	}

}
