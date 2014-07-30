package com.xchagger.pattern.state;

public class StateEngine {

	private State hasQuarterState;
	private State noQuarterState;
	private State soldOutState;
	private State soldState;

	private State state = soldOutState;

	private int count = 0;

	public StateEngine(int count) {
		this.count = count;
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);

		if (count > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall() {
		System.out.println("Ball released");
		if (count != 0) {
			count--;
		}
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public int getCount() {
		return this.count;
	}
	
	@Override
	public String toString() {
		return state.toString();
	}

}
