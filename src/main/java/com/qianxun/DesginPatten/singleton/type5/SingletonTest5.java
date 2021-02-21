package com.qianxun.DesginPatten.singleton.type5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest5 {

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

//懒汉式(同步代码快)
class Singleton {

	private static Singleton singleton;

	private Singleton() {
	}

	//同步代码，解决线程不安全问题
	public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
