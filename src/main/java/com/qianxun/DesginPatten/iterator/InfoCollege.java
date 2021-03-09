package com.qianxun.DesginPatten.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{
	List<Department> deparments;
	
	public InfoCollege() {
		deparments = new ArrayList<Department>();
		addDeparment("信息安全","信息安全");
		addDeparment("网络安全","网络安全");
	}
	
	@Override
	public String getName() {
		return "信息工程学院";
	}

	@Override
	public void addDeparment(String name, String desc) {
		Department department = new Department(name, desc);
		deparments.add(department);
	}

	@Override
	public Iterator<Department> getIterator() {
		return new InfoCollegeIterator(deparments);
	}

}
