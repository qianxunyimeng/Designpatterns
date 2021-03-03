package com.qianxun.DesginPatten.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	//维护目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	//给目标对象 生成一个代理对象
	public Object getProxyInstance() {
		
		/**
		 *  public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
		 */
		
		// 1. ClassLoader loader 指定目标对象使用的类加载器，获取类加载器的方法固定
		// 2. Class<?>[] interfaces目标对象实现的接口类型
		// 3. InvocationHandler h 事件处理，执行目标对象的方法时，会触发事件处理器方法，会把当前执行的目标对象方法作为参数
		
		Class<?> classType = this.target.getClass();
		Object proxyInstance = Proxy.newProxyInstance(classType.getClassLoader(),
				classType.getInterfaces(), 
				new InvocationHandler() {					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("I'm Proxy, I'm invoking...");
				        Object invokeResult = method.invoke(target, args);
				        System.out.println("invoke end!");
						return invokeResult;
					}
				});
		return proxyInstance;
	}
}
