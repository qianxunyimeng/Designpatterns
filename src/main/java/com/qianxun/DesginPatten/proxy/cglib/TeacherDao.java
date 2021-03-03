package com.qianxun.DesginPatten.proxy.cglib;

//目标类，委托类，被代理的对象
public class TeacherDao {

	public void teach() {
		System.out.println("老师授课中。。。。");
	}
	
	public static String getName(String name) {
		System.out.println("123");
		return name;
	}

}
