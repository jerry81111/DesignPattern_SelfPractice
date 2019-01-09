package tw.jerry.designpattern.command.main;

import tw.jerry.designpattern.command.clazz.GarageDoor;
import tw.jerry.designpattern.command.clazz.GarageDoorOpenCommand;
import tw.jerry.designpattern.command.clazz.Light;
import tw.jerry.designpattern.command.clazz.LightOnCommand;
import tw.jerry.designpattern.command.clazz.SimpleRemoteController;

public class UseRemoteController {

	public static void main(String[] args) {

		SimpleRemoteController remote = new SimpleRemoteController();
		LightOnCommand lightOn = new LightOnCommand(new Light());
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(new GarageDoor());
		
		remote.setSlot(lightOn);
		remote.buttonWasPressed();
		remote.setSlot(garageDoorOpen);
		remote.buttonWasPressed();

	}

}
