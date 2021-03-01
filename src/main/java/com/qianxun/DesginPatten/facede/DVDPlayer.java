package com.qianxun.DesginPatten.facede;

public class DVDPlayer {
	
	private DVDPlayer() {};
	
	private static final DVDPlayer instande = new DVDPlayer();
	
	public static DVDPlayer getInstance() {
		return instande;
	}
	
	public void on() {
		System.out.println(" DVD on starting...");
		
	}
	
	public void off() {
		System.out.println(" DVD off...");
	}
	
	public void play() {
		System.out.println(" DVD playing...");
	}

}
