package com.qianxun.DesginPatten.adapter;


//对象适配器
public class ObjectAdapter implements Volt5{

	private Volt220 v220;//聚合关系
	
	
	public ObjectAdapter(Volt220 v220) {
		this.v220 = v220;
	}

	@Override
	public int outputVolt5() {
		int dest  = 0;
		if(null != v220) {
			int src = v220.outputVolt220();
			System.out.println("对象适配器转换");
			dest = src/44;
		}
		return dest;
	}

}
