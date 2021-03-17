package com.qianxun.DesginPatten.responsibilitychain;

//系主任审批
public class DepartmentApprover extends Approver {
	
	public DepartmentApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() <= 5000) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
		}else {
			//当前节点(系主任 审批不了，需要让下一节点审批)
			approver.processRequest(purchaseRequest);
		}
	}

}
