package com.xchagger.pattern.command;

public class CommandLightOn implements Command {

	private ReceiverLight light;

	public CommandLightOn(ReceiverLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
