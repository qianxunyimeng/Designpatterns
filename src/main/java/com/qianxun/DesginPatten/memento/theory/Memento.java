package com.qianxun.DesginPatten.memento.theory;

//备忘录 
public class Memento {

	private String state;

	public Memento(String state) {
		super();
        this.state = state;
	}

	public String getState() {
		return state;
	}
}
