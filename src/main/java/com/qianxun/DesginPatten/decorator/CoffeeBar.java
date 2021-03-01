package com.qianxun.DesginPatten.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CoffeeBar {

	public static void main(String[] args) throws FileNotFoundException {

		// 先点一份咖啡
		Drink order = new LongBlackCoffee();
		System.out.println("费用1= " + order.cost());
		System.out.println("描述1= " + order.getDes());

		// 加入一份牛奶
		order = new Milk(order);
		System.out.println("order 加入一份牛奶 费用 = " + order.cost());
		System.out.println("order 加入一份牛奶 描述= " + order.getDes());

		// 再加入一份巧克力
		order = new Chocolate(order);
		System.out.println("order 加入一份牛奶,再加入一份巧克力费用 = " + order.cost());
		System.out.println("order 加入一份牛奶,再加入一份巧克力描述= " + order.getDes());

		// 再加入一份巧克力
		order = new Chocolate(order);
		System.out.println("order 加入一份牛奶,再加入2份巧克力费用 = " + order.cost());
		System.out.println("order 加入一份牛奶,再加入2份巧克力描述= " + order.getDes());
		
		File file = new File ("hello.txt");
		FileInputStream in=new FileInputStream(file);
		BufferedInputStream inBuffered=new BufferedInputStream (in);
	}
}
