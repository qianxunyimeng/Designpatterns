package com.qianxun.DesginPatten.command;

public class LightOffCommand implements Command {
	// 聚合 LightReceive
	private LightReceive light;

	public LightOffCommand(LightReceive light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
