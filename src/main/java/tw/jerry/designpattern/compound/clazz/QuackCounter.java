package tw.jerry.designpattern.compound.clazz;

import tw.jerry.designpattern.compound.inter.Observer;
import tw.jerry.designpattern.compound.inter.Quackable;

public class QuackCounter implements Quackable {

	Quackable duck;
	static int numberQuack;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		duck.quack();
		numberQuack++;
	}

	public static int getQuackTimes() {
		return numberQuack;
	}

	@Override
	public void registOberserver(Observer observer) {
		duck.registOberserver(observer);
	}

	@Override
	public void notifyOberservers() {
		duck.notifyOberservers();
		
	}

}
