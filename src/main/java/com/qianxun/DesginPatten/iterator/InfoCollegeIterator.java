package com.qianxun.DesginPatten.iterator;

import java.util.Iterator;
import java.util.List;

//信息学院
public class InfoCollegeIterator implements Iterator<Department> {

	List<Department> deparments;
	int index = -1;
	
	public InfoCollegeIterator(List<Department> deparments) {
		this.deparments = deparments;
	}

	@Override
	public boolean hasNext() {
		if(index >= deparments.size() - 1) {
			return false;
		}
		index = index + 1;
		return true;
	}

	@Override
	public Department next() {
		return deparments.get(index);
	}
    public void remove() {
    	
    }
}
