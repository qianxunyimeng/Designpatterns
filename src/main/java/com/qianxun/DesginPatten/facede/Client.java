package com.qianxun.DesginPatten.facede;

public class Client {
	public static void main(String[] args) {
		HomeTheaterFacde homeTheaterFacde = new HomeTheaterFacde();
		
		homeTheaterFacde.ready();//准备
		homeTheaterFacde.play();//播放
		homeTheaterFacde.pause();//暂停
		homeTheaterFacde.end();//结束
	}
}
