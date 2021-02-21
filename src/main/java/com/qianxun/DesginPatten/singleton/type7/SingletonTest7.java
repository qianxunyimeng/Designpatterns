package com.qianxun.DesginPatten.singleton.type7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest7 {

	public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Singleton instance_1 = Singleton.getInstance();
		Singleton instance_2 = Singleton.getInstance();
		System.out.println(instance_1 == instance_2);// true

		Class object = Singleton.class;
		Constructor constructor = object.getDeclaredConstructor();
		constructor.setAccessible(true);

		Singleton instance_3 = (Singleton) constructor.newInstance();

		System.out.println(instance_3 == instance_2);// false

	}

}

//静态内部类【推荐】
class Singleton {

	private Singleton() {
	}
	
	//写一个静态内部类,该类中有一个静态属性 Singleton
	private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
	//提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
