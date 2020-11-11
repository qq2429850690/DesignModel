package com.huaxu.designModel.decorator;

import com.huaxu.designModel.decorator.decorators.LovelyGirl;
import com.huaxu.designModel.decorator.decorators.PureGirl;
import com.huaxu.designModel.decorator.decorators.SexyGirl;
import com.huaxu.designModel.decorator.extend.LovelyPureSexWangMeiLi;


public class Lison {
	
	public static void main(String[] args) {
		System.out.println("----------使用继承关系实现-----------");
		Girl girl1 = new LovelyPureSexWangMeiLi();
		girl1.dance();
		
		System.out.println("------------华丽分割线--------------------");
		
		System.out.println("----------使用装饰器模式实现---------");
		Girl girl2 = new LovelyGirl(new SexyGirl(new PureGirl(new WangMeiLi())));
		girl2.dance();
		
		
	}

}
