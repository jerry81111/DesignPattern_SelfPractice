package tw.jerry.designpattern.strategy.clazz;

import tw.jerry.designpattern.strategy.inter.FlyBehavier;

public class FlyWithWings implements FlyBehavier{

	@Override
	public void fly() {
		System.out.println("I'm fly");
		
	}

}
