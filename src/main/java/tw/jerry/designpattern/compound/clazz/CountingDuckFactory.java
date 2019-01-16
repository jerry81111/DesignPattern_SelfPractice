package tw.jerry.designpattern.compound.clazz;

import tw.jerry.designpattern.compound.abstractclazz.AbstractDuckFactory;
import tw.jerry.designpattern.compound.inter.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createGallardDuck() {
		return new QuackCounter(new GallardDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
