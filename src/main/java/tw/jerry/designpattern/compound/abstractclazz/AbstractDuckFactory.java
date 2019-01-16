package tw.jerry.designpattern.compound.abstractclazz;

import tw.jerry.designpattern.compound.inter.Quackable;

public abstract class AbstractDuckFactory {

	public abstract Quackable createGallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createRubberDuck();
	
	
	
}
