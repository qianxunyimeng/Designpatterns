package com.qianxun.DesginPatten.observer;

public class Client {

	public static void main(String[] args) {
		
		//创建 主题 Subject
		WeatherData weatherData = new WeatherData();
		
		//创建观察者
		CurrentConditions currentConditions = new CurrentConditions();
		
		weatherData.registObserver(currentConditions);
		weatherData.setData(37.5f, 48f, 78f);
	}
}
