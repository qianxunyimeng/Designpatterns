package com.qianxun.DesginPatten.command;

public class RemoteController {

	Command[] onCommands;

	Command[] offCommands;

	// 撤销
	Command undoCommand;

	// 对按钮初始化
	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}

	}

	public void setCommand(int i, Command onCommand, Command offCommand) {
		onCommands[i] = onCommand;
		offCommands[i] = offCommand;
	}

	// 开 按钮被按下
	public void onButtonPushed(int no) {
		onCommands[no].execute();
		// 记录本次操作，用于撤销的操作
		undoCommand = onCommands[no];
	}

	// 关 按钮被按下
	public void offButtonPushed(int no) {
		offCommands[no].execute();
		// 记录本次操作，用于撤销的操作
		undoCommand = offCommands[no];
	}

	// 撤销 按钮被按下
	public void undoButtonPushed() {
		undoCommand.undo();
	}

}
