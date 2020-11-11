package com.huaxu.designModel.decorator.decorators;

import com.huaxu.designModel.decorator.Girl;

public class PureGirl implements Girl {
	
	private Girl girl;
	
	

	public PureGirl(Girl girl) {
		super();
		this.girl = girl;
	}



	@Override
	public void dance() {
		System.out.println("着装清纯……");
		girl.dance();

	}

}
