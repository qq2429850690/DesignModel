package com.huaxu.designModel.decorator.extend;

import com.huaxu.designModel.decorator.WangMeiLi;

public class PureSexyWangMeiLi extends WangMeiLi {
	
	@Override
	public void dance() {
		System.out.println("着装清纯……");
		System.out.println("着装性感……");
		super.dance();

	}

}
