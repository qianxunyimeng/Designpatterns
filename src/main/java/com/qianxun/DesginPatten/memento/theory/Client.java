package com.qianxun.DesginPatten.memento.theory;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretake caretake = new Caretake();
		
		originator.setState("状态 #1: 生命力100");
		caretake.add(originator.saveState());
		
		originator.setState("状态 #2: 生命力80");
		caretake.add(originator.saveState());
		
		originator.setState("状态 #3: 生命力75");
		caretake.add(originator.saveState());
		
		System.out.println("当前状态:" + originator.getState());
		System.out.println("状态恢复#1 .....");
		originator.restoreState(caretake.getMemento(0));
		System.out.println("当前状态:" + originator.getState());
		
	}

}
