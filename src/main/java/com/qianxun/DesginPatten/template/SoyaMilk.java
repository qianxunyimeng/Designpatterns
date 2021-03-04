package com.qianxun.DesginPatten.template;

//抽象类
public abstract class SoyaMilk {

	//模板方法，禁止让子类重写
	public final void make() {
		select();
		if(customAddCondiments()) {
			addCondiments();
		}		
		soak();
		beat();
	}
	
	//第一步，选材
	void select() {
		System.out.println(" 第一步: 选择新鲜的黄豆 ");
	}
	
	// 添加配料，配料不同，最终产品也不同，子类必须重写
	abstract void addCondiments();
	
	void soak() {
		System.out.println(" 第三步: 浸泡材料");
	}
	
	void beat() {
		System.out.println("第四步: 打磨，得到豆浆");
	}
	
	//钩子方法，是否需要添加配料
	boolean customAddCondiments() {
		return true;
	}
}
