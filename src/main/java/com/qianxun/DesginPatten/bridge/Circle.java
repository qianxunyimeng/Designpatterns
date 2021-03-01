package com.qianxun.DesginPatten.bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
		
	}

	@Override
	public void draw() {
		color.bepaint("圆形");
		
	}
}
