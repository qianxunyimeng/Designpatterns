package com.qianxun.DesginPatten.observer;


public interface Subject {
	//注册 观察者
	public abstract void registObserver(Observer observer);
	//移除 观察者
	public abstract void removeObserver(Observer observer);
	//通知 观察者
	public abstract void notifyObserver();

}
