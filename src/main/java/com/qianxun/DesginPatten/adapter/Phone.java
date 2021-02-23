package com.qianxun.DesginPatten.adapter;

public class Phone {

	//充电方法
	public void charging(Volt5 v5) {
		if(v5.outputVolt5() == 5) {
			System.out.println("输出电压为: 5V,可以充电");
		}else {
			System.out.println("输出电压过高,不能充电");
		}
	}
}
