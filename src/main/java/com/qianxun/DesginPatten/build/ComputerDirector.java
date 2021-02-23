package com.qianxun.DesginPatten.build;

public class ComputerDirector {
	
	//指挥者，决定如何创建
	public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}
