package com.qianxun.DesginPatten.adapter.interfaceadapter;

public class AbcClient {

	public static void main(String[] args) {
		new AbsAdapter() {
            //选择性 覆盖 需要使用的接口方法
			@Override
			public void fun1() {
				// TODO Auto-generated method stub
				super.fun1();
			}

			@Override
			public void fun3() {
				// TODO Auto-generated method stub
				super.fun3();
			}
			
		};
	}
}
