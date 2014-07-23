package com.xchagger.pattern.command;

public class Client {

	public static void main(String[] args) {

		ReceiverLight receiver = new ReceiverLight();
		CommandLightOn command = new CommandLightOn(receiver);

		Invoker invokeFromClient = new Invoker();
		invokeFromClient.setCommand(command);
		invokeFromClient.runCommand();
	}

}
