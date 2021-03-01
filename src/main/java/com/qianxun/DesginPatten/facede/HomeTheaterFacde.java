package com.qianxun.DesginPatten.facede;

//家庭影院外观类
public class HomeTheaterFacde {

	//定义 各个子系统对象
	private DVDPlayer dvdPlayer;
	private Projector projector;
	//...灯光，屏幕，
	public HomeTheaterFacde() {
		this.dvdPlayer = DVDPlayer.getInstance();
		this.projector = Projector.getInstance();
		// ...
	}
	
	public void ready() {
		//一系列准备工作，DVD,音响，灯光，投影仪。。。
	}
	
	public void play() {
		dvdPlayer.play();
	}
	
	public void pause() {
		
	}
	
	public void end() {
		
	}
}
