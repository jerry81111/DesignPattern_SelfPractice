package tw.jerry.designpattern.compound.clazz;

import tw.jerry.designpattern.compound.inter.Observer;
import tw.jerry.designpattern.compound.inter.Quackable;

public class RubberDuck implements Quackable {

	Observable observable;

	public RubberDuck() {
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak!!");
		notifyOberservers();
	}

	@Override
	public void registOberserver(Observer observer) {
		observable.registOberserver(observer);
	}

	@Override
	public void notifyOberservers() {
		observable.notifyOberservers();
	}

}
