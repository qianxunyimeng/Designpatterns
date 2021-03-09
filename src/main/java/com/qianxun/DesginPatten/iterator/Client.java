package com.qianxun.DesginPatten.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		//学院
		List<College> colleges = new ArrayList<College>();
		
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		
		colleges.add(computerCollege);
		colleges.add(infoCollege);
		
		OutputImpl outputImpl = new OutputImpl(colleges);
		outputImpl.printCollege();
		
		
		
	}

}
