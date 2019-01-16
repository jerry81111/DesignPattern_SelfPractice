package tw.jerry.designpattern.compound.clazz;

import tw.jerry.designpattern.compound.inter.Observer;
import tw.jerry.designpattern.compound.inter.QuackObservable;

public class QuackLogist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("QuackLogist : "+ duck);

	}

}
