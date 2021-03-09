package com.qianxun.DesginPatten.command;

public class Client {

	public static void main(String[] args) {
		//电灯对象(接收者)
		LightReceive lightReceive = new LightReceive();
		//电灯相关 命令
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceive);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceive);
		
		//遥控器
		RemoteController remoteController = new RemoteController();
		
		//对遥控器的11个按钮进行设置 no = 0 的是电灯
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		
		remoteController.onButtonPushed(0);
		
		remoteController.offButtonPushed(0);
		
		remoteController.undoButtonPushed();
	}
}
