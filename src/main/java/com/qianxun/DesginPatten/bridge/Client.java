package com.qianxun.DesginPatten.bridge;


public class Client {
	public static void main(String[] args) {
		//白色
        Color white = new White();
        //圆形
        Circle circle = new Circle(white);
        circle.draw();
        
        //长方形
        Shape rectange = new Rectangle(white);
        rectange.draw();

	}
}
