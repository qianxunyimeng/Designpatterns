package com.qianxun.DesginPatten.memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretake {
	
	private List<Memento> mementos = new ArrayList<Memento>();

	public void add(Memento memento) {
		mementos.add(memento);
		
	}
	
	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}
