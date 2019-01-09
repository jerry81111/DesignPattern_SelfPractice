package tw.jerry.designpattern.command.clazz;

import tw.jerry.designpattern.command.inter.Command;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();

	}

}
