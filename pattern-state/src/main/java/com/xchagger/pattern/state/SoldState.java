package com.xchagger.pattern.state;

public class SoldState implements State {

	private StateEngine stateEngine;

	public SoldState(StateEngine stateEngine) {
		this.stateEngine = stateEngine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("SOLD STATE: Insert Quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("SOLD STATE: Eject Quarter");

	}

	@Override
	public void turnCrank() {
		System.out.println("SOLD STATE: Turn Crank");

	}

	@Override
	public void dispense() {
		System.out.println("SOLD STATE: Dispense");
		stateEngine.releaseBall();
		if (stateEngine.getCount() > 0) {
			stateEngine.setState(stateEngine.getNoQuarterState());
		} else {
			stateEngine.setState(stateEngine.getSoldOutState());
		}
	}

}
