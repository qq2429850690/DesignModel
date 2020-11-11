package com.huaxu.designModel.decorator.decorators;


import com.huaxu.designModel.decorator.Girl;

public class SexyGirl implements Girl {
	
	private Girl girl;
	
	

	public SexyGirl(Girl girl) {
		super();
		this.girl = girl;
	}



	@Override
	public void dance() {
		System.out.println("着装性感……");
		girl.dance();

	}

}
