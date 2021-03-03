package com.qianxun.DesginPatten.proxy.dynamic;

public class Client {

	public static void main(String[] args) {
		//创建目标对象
		ITeacherDao targe = new TeacherDao();
		//创建代理对象
		ITeacherDao proxy = (ITeacherDao) new ProxyFactory(targe).getProxyInstance();
		
		//System.out.println("proxy = " + proxy);
		proxy.teach();
	}
}
