package com.qianxun.DesginPatten.command;

public class LightOnCommand implements Command{

	//聚合 LightReceive
	private LightReceive light;	
	
	public LightOnCommand(LightReceive light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();		
	}

	@Override
	public void undo() {
		light.off();
	}

}
