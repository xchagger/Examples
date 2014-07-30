package com.xchagger.pattern.state;

public class HasQuarterState implements State {

	private StateEngine stateEngine;

	public HasQuarterState(StateEngine stateEngine) {
		this.stateEngine = stateEngine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("HAS QUARTER STATE: Insert Quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("HAS QUARTER STATE: Eject Quarter");
		stateEngine.setState(stateEngine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("HAS QUARTER STATE: Turn Crank");
		stateEngine.setState(stateEngine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("HAS QUARTER STATE: Dispense");

	}

}
