package com.xchagger.pattern.state;

public class NoQuarterState implements State {

	private StateEngine stateEngine;

	public NoQuarterState(StateEngine stateEngine) {
		this.stateEngine = stateEngine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("NO QUARTER STATE: Insert Quarter");
		stateEngine.setState(stateEngine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("NO QUARTER STATE: Eject Quarter");

	}

	@Override
	public void turnCrank() {
		System.out.println("NO QUARTER STATE: Turn Crank");

	}

	@Override
	public void dispense() {
		System.out.println("NO QUARTER STATE: Dispense");

	}

}
