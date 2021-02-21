package com.qianxun.DesginPatten.singleton.type6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest6 {

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

//双重检查【推荐】
class Singleton {

	private static volatile Singleton singleton;

	private Singleton() {
	}

	//volatile  + 双重检测  实现线程安全
	//解决线程安全问题, 同时解决懒加载问题
	//同时保证了效率, 推荐使用
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }//同步锁结束
        }
        return singleton;
    }
}
