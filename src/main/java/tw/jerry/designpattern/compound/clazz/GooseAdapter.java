package tw.jerry.designpattern.compound.clazz;

import tw.jerry.designpattern.compound.inter.Observer;
import tw.jerry.designpattern.compound.inter.Quackable;

public class GooseAdapter implements Quackable {

	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		this.observable = new Observable(this);
		
	}

	@Override
	public void quack() {
		goose.honk();
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
