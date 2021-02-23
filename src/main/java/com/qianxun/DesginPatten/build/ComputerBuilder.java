package com.qianxun.DesginPatten.build;

//抽象构建者类 Build
public abstract class ComputerBuilder {
	public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}
