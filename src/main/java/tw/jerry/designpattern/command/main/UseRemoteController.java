package tw.jerry.designpattern.command.main;

import tw.jerry.designpattern.command.clazz.GarageDoor;
import tw.jerry.designpattern.command.clazz.GarageDoorOpenCommand;
import tw.jerry.designpattern.command.clazz.Light;
import tw.jerry.designpattern.command.clazz.LightOnCommand;
import tw.jerry.designpattern.command.clazz.MapRemoteController;
import tw.jerry.designpattern.command.clazz.SimpleRemoteController;

public class UseRemoteController {

	public static void main(String[] args) {

		LightOnCommand lightOn = new LightOnCommand(new Light());
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(new GarageDoor());
		
		SimpleRemoteController remote = new SimpleRemoteController();
		remote.setSlot(lightOn);
		remote.buttonWasPressed();
		remote.setSlot(garageDoorOpen);
		remote.buttonWasPressed();
		
		MapRemoteController mapRemote= new MapRemoteController();
		mapRemote.setSlot("lightOn", lightOn);
		mapRemote.setSlot("garageDoorOpen", garageDoorOpen);
		mapRemote.buttonWasPressed("lightOn");
		mapRemote.buttonWasPressed("garageDoorOpen");
		
	}

}
