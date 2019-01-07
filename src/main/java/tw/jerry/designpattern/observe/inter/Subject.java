package tw.jerry.designpattern.observe.inter;

public interface Subject {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
	
}
