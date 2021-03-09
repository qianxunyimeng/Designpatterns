package com.qianxun.DesginPatten.command;

//命令接口
public interface Command {

	public abstract void execute();
	
	public abstract void undo();
}
