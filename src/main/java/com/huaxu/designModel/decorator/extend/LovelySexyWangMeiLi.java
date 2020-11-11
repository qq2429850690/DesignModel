package com.huaxu.designModel.decorator.extend;


import com.huaxu.designModel.decorator.WangMeiLi;

public class LovelySexyWangMeiLi extends WangMeiLi {
	
	@Override
	public void dance() {
		System.out.println("着装可爱……");
		System.out.println("着装性感……");
		super.dance();

	}

}
