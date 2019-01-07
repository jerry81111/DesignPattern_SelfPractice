package tw.jerry.designpattern.observe.clazz;

import tw.jerry.designpattern.observe.inter.DisplayElement;
import tw.jerry.designpattern.observe.inter.Observer;
import tw.jerry.designpattern.observe.inter.Subject;

public class CurrentConditionDisPlay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentConditionDisPlay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current temp = " + temp + ",humidity = " + humidity);

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.display();

	}

}
