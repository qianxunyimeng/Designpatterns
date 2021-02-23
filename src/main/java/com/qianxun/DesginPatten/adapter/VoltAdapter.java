package com.qianxun.DesginPatten.adapter;

//适配器类
public class VoltAdapter extends Volt220 implements Volt5{

	@Override
	public int outputVolt5() {		
		int src = outputVolt220();
		int dist = src/44;		
		return dist;
	}

}
