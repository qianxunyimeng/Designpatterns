package com.qianxun.DesginPatten.flyweight;

public class Client {
	public static void main(String[] args) {
		WebsiteFactory websiteFactory = new WebsiteFactory();
		WebSite website1 = websiteFactory.getWebsiteCategory("新闻");
		website1.use();
		
		WebSite website2 = websiteFactory.getWebsiteCategory("博客");
		website2.use();
		
		WebSite website3 = websiteFactory.getWebsiteCategory("博客");
		website3.use();

	}
}
