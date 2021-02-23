package com.qianxun.DesginPatten.build;

public class Client {
	public static void main(String[] args) {
		//1.创建指挥者
		ComputerDirector director=new ComputerDirector();//1
		//2.目标builder
        ComputerBuilder builder=new MacComputerBuilder("I5处理器","三星125");//2
        //3.director组装builder
        director.makeComputer(builder);//3
        //4.使用builder创建产品实例
        Computer macComputer=builder.getComputer();//4
        System.out.println("mac computer:"+macComputer.toString());

        ComputerBuilder lenovoBuilder=new LenovoComputerBuilder("I7处理器","海力士222");
        director.makeComputer(lenovoBuilder);
        Computer lenovoComputer=lenovoBuilder.getComputer();
        System.out.println("lenovo computer:"+lenovoComputer.toString());
	}
    
}
