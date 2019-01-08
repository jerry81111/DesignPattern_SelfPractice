package tw.jerry.designpattern.decorate.main;

import tw.jerry.designpattern.decorate.abstractclazz.Beverage;
import tw.jerry.designpattern.decorate.clazz.Espresso;
import tw.jerry.designpattern.decorate.clazz.Latte;
import tw.jerry.designpattern.decorate.clazz.Milk;
import tw.jerry.designpattern.decorate.clazz.Whip;

public class StarBuzzCoffee {
	
	public static void main(String[] args) {
		Beverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
		
		Beverage beverage2 =new Latte();
		beverage2=new Milk(beverage2);
		beverage2=new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		
		
	}

}
