package com.qianxun.DesginPatten.iterator;

import java.util.Iterator;
//计算机学院
public class ComputerCollegeIterator implements Iterator<Department> {

	Department[] deparments;
	int position = 0;//遍历位置
	
	public ComputerCollegeIterator(Department[] deparments) {
		this.deparments = deparments;
	}

	@Override
	public boolean hasNext() {
		if(position >= deparments.length || deparments[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Department next() {
		Department department = deparments[position];
		position = position + 1;
		return department;
	}
	//删除的方法
	public void remove() {
		
	}

}
