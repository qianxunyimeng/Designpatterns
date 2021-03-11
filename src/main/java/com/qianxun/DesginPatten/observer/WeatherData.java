package com.qianxun.DesginPatten.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

	private float temperature;
	private float pressure;
	private float humidity;
	
	private List<Observer>  observers;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	public float getTemperature() {
		return temperature;
	}
	public float getPressure() {
		return pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	
	public void setData(float temperature,float pressure,float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		change();
	}
	
	public void change() {
		notifyObserver();
	}
	
	@Override
	public void registObserver(Observer observer) {
		this.observers.add(observer);
		
	}
	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temperature,pressure,humidity);
		}
	}
}
