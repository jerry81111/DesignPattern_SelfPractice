package tw.jerry.designpattern.observe.main;

import tw.jerry.designpattern.observe.clazz.CurrentConditionDisPlay;
import tw.jerry.designpattern.observe.clazz.WeatherData;

public class WeatherStation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisPlay currentConditionDisPlay = new CurrentConditionDisPlay(weatherData);

		weatherData.setMeasurements(100, 200, 300);
		weatherData.setMeasurements(111, 222, 333);
		weatherData.setMeasurements(789, 456, 123);
	}

}
