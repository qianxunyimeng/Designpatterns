package com.qianxun.DesginPatten.flyweight;

import java.util.HashMap;

public class WebsiteFactory {
	// 定义一个池容器
	private static HashMap<String, WebSite> pool = new HashMap<>();

	// 享元工厂
	public static WebSite getWebsiteCategory(String type) {
		WebSite website = null;

		if (pool.containsKey(type)) { // 池中有该对象
			website = pool.get(type);
			System.out.print("已有 " + type + " 直接从池中取---->");
		} else {
			// 根据外部状态创建享元对象
			website = new ConcreteWebSite(type);
			// 放入池中
			pool.put(type, website);
			System.out.print("创建 " + type + " 并从池中取出---->");
		}

		return website;
	}

	public int getWebsiteCount() {
		return pool.size();
	}
}
