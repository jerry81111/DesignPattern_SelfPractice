package tw.jerry.designpattern.decorate.clazz;

import tw.jerry.designpattern.decorate.abstractclazz.Beverage;

public class Espresso extends Beverage{

	public Espresso()
	{
		description="Espresso";
	}
	
	@Override
	public int cost() {
		return 100;
	}

}
