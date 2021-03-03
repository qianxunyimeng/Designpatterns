package com.qianxun.DesginPatten.flyweight;

public class ConcreteWebSite extends WebSite {

	private String type;//类型，发布形式(外部状态)

	public ConcreteWebSite(String type) {

		this.type = type;
	}

	@Override
	public void use() {
		System.out.println("网站发布形式: " + type);
		
	}

}
