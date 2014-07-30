package com.xchagger.pattern.observer;

public class CurrentDisplayElement implements Observer, DisplayElement {

	private float temp;
	private float humidity;

	private Subject weatherData;

	public CurrentDisplayElement(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("CurrentDisplay: temp[" + temp + "] and humidity["
				+ humidity + "]");

	}
}
