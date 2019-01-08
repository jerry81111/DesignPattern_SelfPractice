package tw.jerry.designpattern.decorate.clazz;

import tw.jerry.designpattern.decorate.abstractclazz.Beverage;
import tw.jerry.designpattern.decorate.abstractclazz.CondimentDecorator;

public class Whip extends CondimentDecorator{
	
	Beverage beverage;

	
	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+" , Whip";
	}

	@Override
	public int cost() {
		return 15+beverage.cost();
	}

}
