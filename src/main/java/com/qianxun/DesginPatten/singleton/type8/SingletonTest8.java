package com.qianxun.DesginPatten.singleton.type8;

public class SingletonTest8 {

	public static void main(String[] args) {
		Singleton instance_1 = Singleton.INSTANCE;
		Singleton instance_2 = Singleton.INSTANCE;
		
		System.out.println(instance_1 == instance_2);//true
	}
}

enum Singleton {
	INSTANCE;

	
	  public Singleton getInstance() { return INSTANCE; }
	 
}
