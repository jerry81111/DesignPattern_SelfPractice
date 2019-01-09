package tw.jerry.designpattern.command.clazz;

import tw.jerry.designpattern.command.inter.Command;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();

	}

}
