package com.xchagger.pattern.state;

public class SoldOutState implements State {

	private StateEngine stateEngine;

	public SoldOutState(StateEngine stateEngine) {
		this.stateEngine = stateEngine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("SOLD OUT STATE: Insert Quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("SOLD OUT STATE: Eject Quarter");

	}

	@Override
	public void turnCrank() {
		System.out.println("SOLD OUT STATE: Turn Crank");

	}

	@Override
	public void dispense() {
		System.out.println("SOLD OUT STATE: Dispense");

	}

}
