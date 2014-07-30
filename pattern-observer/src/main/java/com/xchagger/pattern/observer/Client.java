package com.xchagger.pattern.observer;

public class Client {
	public static void main(String[] args) {
		SubjectWeatherData subject = new SubjectWeatherData();

		CurrentDisplayElement currentDisplayObserver = new CurrentDisplayElement(
				subject);
		ForecastDisplayElement forecastDisplayObserver = new ForecastDisplayElement(
				subject);

		subject.setMeasurements(1, 1, 1);
		subject.setMeasurements(2, 2, 2);
	}
}
