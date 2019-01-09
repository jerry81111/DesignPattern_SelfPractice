package tw.jerry.designpattern.strategy.main;

import tw.jerry.designpattern.strategy.clazz.MallardDuck;

public class DuckSimulation {

	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		
		duck.performFly();
		duck.swin();
		duck.display();
		
		
	}
}
