package tw.jerry.designpattern.command.clazz;

import java.util.HashMap;
import java.util.Map;

import tw.jerry.designpattern.command.inter.Command;

public class MapRemoteController {
	Map<String, Command> slots= new HashMap<>();

	public MapRemoteController() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setSlot(String operation,Command slot) {
		slots.put(operation, slot);
	}


	public void buttonWasPressed(String operation) {
		slots.get(operation).execute();
	}
}
