package com.qianxun.DesginPatten.observer;

//观察者 接口
public interface Observer {
	
	public abstract void update(float temperature,float pressure,float humidity);

}
