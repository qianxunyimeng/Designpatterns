package com.qianxun.DesginPatten.facede;

//投影仪
public class Projector {
	private Projector() {
	};

	private static final Projector instande = new Projector();

	public static Projector getInstance() {
		return instande;
	}

	public void on() {
		System.out.println(" Projector on starting...");

	}

	public void off() {
		System.out.println(" Projector off...");
	}

	public void focus() {
		System.out.println(" Projector focus...");
	}
}
