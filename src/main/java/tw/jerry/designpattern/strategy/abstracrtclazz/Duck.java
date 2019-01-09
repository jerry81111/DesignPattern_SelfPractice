package tw.jerry.designpattern.strategy.abstracrtclazz;

import tw.jerry.designpattern.strategy.inter.FlyBehavier;

public abstract class Duck {

	public FlyBehavier flyBehavier;

	public Duck() {
	}
	
	public void performFly() {
		flyBehavier.fly();
	}
	
	public void swin() {
		System.out.println("All Ducks swim");
	};
	
	public abstract void display();
}
