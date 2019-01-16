package tw.jerry.designpattern.compound.clazz;

import tw.jerry.designpattern.compound.abstractclazz.AbstractDuckFactory;
import tw.jerry.designpattern.compound.inter.Quackable;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createGallardDuck() {
		return new GallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
