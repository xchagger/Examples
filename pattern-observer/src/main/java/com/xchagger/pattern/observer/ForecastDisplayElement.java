package com.xchagger.pattern.observer;

public class ForecastDisplayElement implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private float pressure;

	private Subject weatherData;

	public ForecastDisplayElement(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("ForecastDisplay: temp[" + temp + "] and humidity["
				+ humidity + "] pressure[" + pressure + "]");

	}
}
