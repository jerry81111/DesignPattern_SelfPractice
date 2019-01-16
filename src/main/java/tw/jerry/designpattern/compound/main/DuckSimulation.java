package tw.jerry.designpattern.compound.main;

import tw.jerry.designpattern.compound.abstractclazz.AbstractDuckFactory;
import tw.jerry.designpattern.compound.clazz.CountingDuckFactory;
import tw.jerry.designpattern.compound.clazz.Flock;
import tw.jerry.designpattern.compound.clazz.Goose;
import tw.jerry.designpattern.compound.clazz.GooseAdapter;
import tw.jerry.designpattern.compound.clazz.QuackCounter;
import tw.jerry.designpattern.compound.clazz.QuackLogist;
import tw.jerry.designpattern.compound.clazz.RubberDuck;
import tw.jerry.designpattern.compound.inter.Quackable;

public class DuckSimulation {

	public static void main(String[] args) {

		DuckSimulation duckSimulation = new DuckSimulation();
		duckSimulation.simaulate(new CountingDuckFactory());

	}

	void simaulate(AbstractDuckFactory duckFactory) {

		Flock flockOfRedHead = new Flock();
		
		Quackable redHeadDuck1 = duckFactory.createRedHeadDuck();
		Quackable redHeadDuck2 = duckFactory.createRedHeadDuck();
		Quackable redHeadDuck3 = duckFactory.createRedHeadDuck();
		Quackable redHeadDuck4 = duckFactory.createRedHeadDuck();
		
		flockOfRedHead.addQuack(redHeadDuck1);
		flockOfRedHead.addQuack(redHeadDuck2);
		flockOfRedHead.addQuack(redHeadDuck3);
		flockOfRedHead.addQuack(redHeadDuck4);

		
		Flock flockOfDucks = new Flock();

//		Quackable gallardDuck = duckFactory.createGallardDuck();
//		Quackable redHeadDuck = duckFactory.createRedHeadDuck();
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseAdapter = new QuackCounter(new GooseAdapter(new Goose()));

//		flockOfDucks.addQuack(gallardDuck);
//		flockOfDucks.addQuack(redHeadDuck);
		flockOfDucks.addQuack(rubberDuck);
		flockOfDucks.addQuack(gooseAdapter);
		
		flockOfDucks.addQuack(flockOfRedHead);
		
		
		QuackLogist logist = new QuackLogist();
		flockOfDucks.registOberserver(logist);
		
		simulate(flockOfDucks);
//		simulate(flockOfRedHead);
		System.out.println(QuackCounter.getQuackTimes());

	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
