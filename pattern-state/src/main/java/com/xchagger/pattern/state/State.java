package com.xchagger.pattern.state;

public interface State {
	
	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();
}
