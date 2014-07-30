package com.xchagger.pattern.state;

public class Client {

	public static void main(String[] args) {
		StateEngine stateEngine = new StateEngine(2);
		System.out.println(stateEngine);

		stateEngine.insertQuarter();
		stateEngine.turnCrank();

		System.out.println(stateEngine);

		stateEngine.insertQuarter();
		stateEngine.turnCrank();

		stateEngine.insertQuarter();
		stateEngine.turnCrank();

		System.out.println(stateEngine);
	}
}
