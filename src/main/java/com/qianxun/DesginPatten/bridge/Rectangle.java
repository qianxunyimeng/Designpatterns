package com.qianxun.DesginPatten.bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		color.bepaint("长方形");
		
	}

}
