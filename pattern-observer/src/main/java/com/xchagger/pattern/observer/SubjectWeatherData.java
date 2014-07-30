package com.xchagger.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectWeatherData implements Subject {

	private List<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;

	public SubjectWeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
