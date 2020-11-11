package com.huaxu.designModel.decorator.decorators;

import com.huaxu.designModel.decorator.Girl;

public class LovelyGirl implements Girl {
	
	private Girl girl;
	
	

	public LovelyGirl(Girl girl) {
		super();
		this.girl = girl;
	}



	@Override
	public void dance() {
		System.out.println("着装可爱……");
		girl.dance();

	}

}
