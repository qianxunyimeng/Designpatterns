package com.qianxun.DesginPatten.observer;

//当前天气情况
public class CurrentConditions implements Observer{
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	public void update(float temperature,float pressure,float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("当前 气温: " + this.temperature);
		System.out.println("当前 气压: " + this.pressure);
		System.out.println("当前 湿度: " + this.humidity);
	}

}
