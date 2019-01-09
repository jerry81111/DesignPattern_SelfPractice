package tw.jerry.designpattern.command.clazz;

import tw.jerry.designpattern.command.inter.Command;

public class SimpleRemoteController {

	Command slot;

	public SimpleRemoteController() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setSlot(Command slot) {
		this.slot = slot;
	}


	public void buttonWasPressed() {
		slot.execute();
	}

}
