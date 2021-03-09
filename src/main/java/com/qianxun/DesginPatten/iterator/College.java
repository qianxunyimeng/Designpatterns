package com.qianxun.DesginPatten.iterator;

import java.util.Iterator;

public interface College {
	
	public abstract String getName();
	
	public abstract void addDeparment(String name,String desc);
	
	public abstract Iterator<Department> getIterator();

}
