package com.qianxun.DesginPatten.proxy.cglib;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {

	// 目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象 生成一个代理对象
	public Object getProxyInstance() {
		
		Enhancer enhancer = new Enhancer();
		//设置父类
		enhancer.setSuperclass(target.getClass());
		//设置回调函数
		enhancer.setCallback(this);
		//生成子类对象，即代理对象
		return enhancer.create();

	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		System.out.println("cglib 代理开始~~~~");
		Object result = method.invoke(target, args);
		System.out.println("cglib 代理结束~~~~");
		return result;
	}

}
