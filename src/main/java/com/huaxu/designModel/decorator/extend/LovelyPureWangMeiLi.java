package com.huaxu.designModel.decorator.extend;


import com.huaxu.designModel.decorator.WangMeiLi;

public class LovelyPureWangMeiLi extends WangMeiLi {
	
	@Override
	public void dance() {
		System.out.println("着装可爱……");
		System.out.println("着装清纯……");
		super.dance();

	}

}
