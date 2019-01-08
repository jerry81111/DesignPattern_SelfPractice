package tw.jerry.designpattern.decorate.clazz;

import tw.jerry.designpattern.decorate.abstractclazz.Beverage;
import tw.jerry.designpattern.decorate.abstractclazz.CondimentDecorator;

public class Milk extends CondimentDecorator{

	Beverage beverage;
	
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+" , Milk";
	}

	@Override
	public int cost() {
		return 10+beverage.cost();
	}
}
