package com.qianxun.DesginPatten.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{

	Department[] deparments;
	int num = 0;//当前数组个数
	
	public ComputerCollege() {
		deparments = new Department[2];
		addDeparment("JAVA","JAVA");
		addDeparment("C","C语言");
	}
	
	@Override
	public String getName() {
		return "计算机学院";
	}

	@Override
	public void addDeparment(String name, String desc) {
		Department department = new Department(name, desc);
		deparments[num] = department;
		num = num + 1;
	}

	@Override
	public Iterator<Department> getIterator() {
		// TODO Auto-generated method stub
		return new ComputerCollegeIterator(deparments);
	}

}
