package tw.jerry.designpattern.compound.inter;


public interface QuackObservable {

	public void registOberserver(Observer observer) ;
	public void notifyOberservers();
	
}
