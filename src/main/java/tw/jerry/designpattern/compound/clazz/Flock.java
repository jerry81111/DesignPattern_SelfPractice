package tw.jerry.designpattern.compound.clazz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tw.jerry.designpattern.compound.inter.Quackable;

public class Flock implements Quackable {

	List<Quackable> quackers = new ArrayList<>();

	public void addQuack(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}

	}


	@Override
	public void notifyOberservers() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.notifyOberservers();
		}
	}

	@Override
	public void registOberserver(tw.jerry.designpattern.compound.inter.Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.registOberserver(observer);
		}
	}


}
