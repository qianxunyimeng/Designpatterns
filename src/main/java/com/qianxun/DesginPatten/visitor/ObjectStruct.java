package com.qianxun.DesginPatten.visitor;

import java.util.LinkedList;
import java.util.List;
//数据结构，管理很多人(Man,Woman)
public class ObjectStruct {
	
	private List<Person> list = new LinkedList<Person>();
	//添加
	public void attach(Person person) {
		list.add(person);
	}
	//移除
	public void detach(Person person) {
		list.remove(person);
	}
	//显示测评信息
	public void display(Action action) {
		for (Person person : list) {
			person.accept(action);
		}
		
	}

}
