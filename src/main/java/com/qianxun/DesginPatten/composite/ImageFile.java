package com.qianxun.DesginPatten.composite;

//图像文件
public class ImageFile extends File {

	public ImageFile (String name) {
        super(name);
    }

    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }
}
