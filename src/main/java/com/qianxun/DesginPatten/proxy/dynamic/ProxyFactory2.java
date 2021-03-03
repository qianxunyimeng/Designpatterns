package com.qianxun.DesginPatten.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory2 implements InvocationHandler {

	// 维护目标对象
	private Object target;

	public ProxyFactory2(Object target) {
		this.target = target;
	}

	// 给目标对象 生成一个代理对象
	public Object getProxyInstance() {
		Class<?> classType = this.target.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("I'm Proxy, I'm invoking...");
		Object invokeResult = method.invoke(target, args);
        System.out.println("invoke end!");
		return invokeResult;
	}

}
