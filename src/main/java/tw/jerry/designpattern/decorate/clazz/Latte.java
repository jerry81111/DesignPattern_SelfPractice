package tw.jerry.designpattern.decorate.clazz;

import tw.jerry.designpattern.decorate.abstractclazz.Beverage;

public class Latte extends Beverage{

	public Latte(){
		description="Latte";
	}

	@Override
	public int cost() {
		return 80;
	} 
	
}
