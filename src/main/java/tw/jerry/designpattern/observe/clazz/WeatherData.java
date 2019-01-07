package tw.jerry.designpattern.observe.clazz;

import java.util.ArrayList;

import tw.jerry.designpattern.observe.inter.Observer;
import tw.jerry.designpattern.observe.inter.Subject;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	
	
	public WeatherData() {
		observers=new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer->{
			observer.update(temp, humidity, pressure);
		});
	}

	public void setMeasurements( float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.notifyObservers();
	}

	
	
	
}
