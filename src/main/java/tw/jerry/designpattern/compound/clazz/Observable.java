package tw.jerry.designpattern.compound.clazz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tw.jerry.designpattern.compound.inter.Observer;
import tw.jerry.designpattern.compound.inter.QuackObservable;

public class Observable implements QuackObservable {

	List<Observer> observers = new ArrayList<>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	@Override
	public void registOberserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void notifyOberservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}

	}

}
