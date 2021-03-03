package com.qianxun.DesginPatten.proxy.cglib;

public class Client {
	public static void main(String[] args) {

		// 创建目标对象
		TeacherDao teacherDao = new TeacherDao();
		// 获取代理对象
		TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
		// 执行目标方法
		proxyInstance.teach();
		
		//static 方法不会走代理
		proxyInstance.getName("sql");
	}
}
