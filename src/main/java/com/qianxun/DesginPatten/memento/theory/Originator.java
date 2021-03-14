package com.qianxun.DesginPatten.memento.theory;

//原始对象
public class Originator {
	
	private String state;//状态信息

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//保存 状态 到 备忘录
	public Memento saveState() {
		return new Memento(this.state);
	}
	
	//从备忘录 回复 状态
	public void restoreState(Memento memento) {
		this.state = memento.getState();
	}

}
