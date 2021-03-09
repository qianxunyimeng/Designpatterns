package com.qianxun.DesginPatten.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
	
	//学院集合
	List<College> colleges;

	public OutputImpl(List<College> colleges) {
		this.colleges = colleges;
	}
	//遍历 所有学院，再调用printDeparment
	public void printCollege() {
		Iterator<College> iterator = colleges.iterator();
		while(iterator.hasNext()) {
			College college = iterator.next();
			System.out.println("======="+college.getName()+"========");
			printDeparment(college.getIterator());
		}
	}
	
	//输出 学院 的系
	public void printDeparment(Iterator<Department> iterator) {
		while(iterator.hasNext()) {
			Department department = iterator.next();
			System.out.println(department.getName());
		}
	}

}
