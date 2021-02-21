package com.qianxun.DesginPatten.singleton.type3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest3 {

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

//懒汉式(线程不安全)
class Singleton {

	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
