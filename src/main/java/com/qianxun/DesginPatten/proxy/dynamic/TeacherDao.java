package com.qianxun.DesginPatten.proxy.dynamic;

//目标类，委托类，被代理的对象
public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println("老师授课中。。。。");
	}

}
