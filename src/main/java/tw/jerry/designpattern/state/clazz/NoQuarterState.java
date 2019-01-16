package tw.jerry.designpattern.state.clazz;

import tw.jerry.designpattern.state.inter.State;

public class NoQuarterState implements State {

	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuater() {
		System.out.println("you inserted a quarter");
		gumballMachine.setState(gumballMachine.HAS_QUARTER);
	}

	@Override
	public void ejectQuater() {
		System.out.println("you haven't inserted a quarter");

	}

	@Override
	public void turncrank() {
		System.out.println("you turned, but there is no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("you need to pay first");
	}

}
