package com.qianxun.DesginPatten.adapter;

public class ObjectClient {
	public static void main(String[] args) {
		System.out.println("====对象适配器====");
		Phone phone = new Phone();
		phone.charging(new ObjectAdapter(new Volt220()));
	}
}
