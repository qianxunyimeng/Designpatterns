package com.qianxun.DesginPatten.singleton.type2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest2 {

	public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton instance_1 = Singleton.getInstance();
		Singleton instance_2 = Singleton.getInstance();
		System.out.println(instance_1 == instance_2);// true
		
		//Singleton instance_3 = (Singleton) Class.forName("com.qianxun.DesginPatten.singleton.type2.Singleton").newInstance();
		//Singleton instance_4 = (Singleton) Class.forName("com.qianxun.DesginPatten.singleton.type2.Singleton").newInstance();
		Class object = Singleton.class;
		Constructor constructor = object.getDeclaredConstructor();
        constructor.setAccessible(true);
        
        Singleton instance_3 = (Singleton) constructor.newInstance();
        
		System.out.println(instance_3 == instance_2);// false

	}

}
//饿汉式(静态代码块)
class Singleton {
	
	//私有构造方法，外部不能通过new的方式创建实例
	private Singleton() {
		
	}
	
	private static Singleton instance; 
	
	static {//在静态代码块中创建实例
		instance = new Singleton();
	}
	
	//对外提供共有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}
