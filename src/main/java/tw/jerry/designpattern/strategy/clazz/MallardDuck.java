package tw.jerry.designpattern.strategy.clazz;

import tw.jerry.designpattern.strategy.abstracrtclazz.Duck;

public class MallardDuck extends Duck {

	
	
	public MallardDuck() {
		flyBehavier=new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("Hello I'm Mallard Duck");
		
	}

}
