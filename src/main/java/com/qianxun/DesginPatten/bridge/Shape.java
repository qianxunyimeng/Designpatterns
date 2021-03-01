package com.qianxun.DesginPatten.bridge;

public abstract class Shape {
	
	Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}

	public void setColor(Color color) {
		this.color = color;
	}



	public abstract void draw();

}
