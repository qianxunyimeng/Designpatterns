package com.qianxun.DesginPatten.template;

public class Client {
	public static void main(String[] args) {
          //红豆 豆浆
		System.out.println(" 制作 红豆 豆浆");
		ReadBeanSoyaMilk readBeanSoyaMilk = new ReadBeanSoyaMilk();
		readBeanSoyaMilk.make();
		System.out.println();
		
		System.out.println(" 制作 花生 豆浆 ");
		//花生 豆浆
		PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
		System.out.println();
		
		System.out.println("制作 纯豆浆");
		PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}
}
