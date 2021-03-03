package com.qianxun.DesginPatten.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		//目标对象
		TeacherDao teacherDao = new TeacherDao();
		//创建代理对象
		TeacherDaoPproxy teacherDaoPproxy = new TeacherDaoPproxy(teacherDao);
		
		teacherDaoPproxy.teach();
	}
}
