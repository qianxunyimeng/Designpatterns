package com.qianxun.DesginPatten.proxy.staticproxy;

public class TeacherDaoPproxy implements ITeacherDao{

	private ITeacherDao target;//目标对象
	
	public TeacherDaoPproxy(ITeacherDao target) {
		this.target = target;
	}

	@Override
	public void teach() {
		System.out.println("代理授课开始。。。");
		target.teach();
		System.out.println("代理授课结束。。。");
		
	}

}
